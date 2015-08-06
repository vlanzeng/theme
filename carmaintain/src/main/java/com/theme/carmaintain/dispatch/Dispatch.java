package com.theme.carmaintain.dispatch;

import java.util.Map;
import java.util.HashMap;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import com.theme.carmaintain.common.util.StringUtil;
import com.theme.carmaintain.common.system.Commons;
import com.theme.carmaintain.common.util.JsonUtil;
import com.theme.carmaintain.common.handle.IHandle;

import org.springframework.web.servlet.ModelAndView;

import com.theme.carmaintain.common.util.CookieUtil;
import com.theme.carmaintain.common.system.StateCode;
import com.theme.carmaintain.common.handle.IViewHandle;
import com.theme.carmaintain.common.system.ConstantCode;

import org.springframework.web.bind.annotation.ResponseBody;

import com.theme.carmaintain.common.util.SpringContextHolder;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dispatch")
@SuppressWarnings("rawtypes")
public class Dispatch {
	/**
	 * 会话令牌
	 */
	private static final String TOKEN = "token";
	/**
	 * IOS设备
	 */
	private static final String IOS = "ios";
	/**
	 * android设备
	 */
	private static final String ANZ = "anz";
	/**
	 * 设备类型（Anz,Ios）
	 */
	public static final String DEVICE_TYPE = "deviceType";
	/**
	 * 请求模块
	 */
	private static final String CMD_ID = "cmdID";
	/**
	 * 系统分配的标识符
	 */
	private static final String USER_ID = "userID";
	private Logger log = Logger.getLogger(this.getClass());

	/**
	 * 接口调度json 形式
	 * 
	 * @author Administrator
	 * @creaetime 2014年4月4日 上午10:39:50
	 * @param header
	 * @param body
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	@ResponseBody
	@RequestMapping(value = "dispatch.action")
	protected Map doDispatch(String header, String body, HttpServletRequest request, HttpServletResponse response) throws Exception {
		log.debug("调度开始");
		log.debug("header解析开始");
		log.debug("header:" + header);
		log.debug("body:" + body);

		Map<String, Object> msgback = new HashMap<String, Object>();
		IHandle ih;
		String receive = "";
		try {
			Map headermap = JsonUtil.readJsonToMap(header);
			msgback.putAll(headermap);
			log.debug("header解析结束");
			log.debug("message start");
			String tokenid = (String) headermap.get(TOKEN);
			String userid = (String) headermap.get(USER_ID);
			String commentid = (String) headermap.get(CMD_ID);
			String devicetype = (String) headermap.get(DEVICE_TYPE);
			log.debug("登陆人:" + userid + ";tokenid:" + tokenid + ";commentid:" + commentid + ";devicetype:" + devicetype);
			if ((devicetype.toLowerCase().equals(ANZ) || devicetype.toLowerCase().equals(IOS)) && !StringUtil.trimIsEmpty(commentid)) {
				try {
					ih = SpringContextHolder.getBean(commentid);
					ih.receiveMessage(msgback, body, headermap);
					log.debug(receive);
				} catch (Exception e) {
					log.error("业务处理异常" + e);
					msgback.put(ConstantCode.RESCODE, StateCode.PROTOCOL_HANDLE_FALSE_CMDID);
				}
			} else {
				msgback.put(ConstantCode.RESCODE, StateCode.PROTOCOL_HANDLE_FALSE_CMDID);
				log.error("devicetype 或者 comid 为空");
			}
		} catch (Exception e) {
			msgback.put(ConstantCode.RESCODE, StateCode.PROTOCOL_HANDLE_FAIL);
			log.error("系统调度异常" + e);
		}
		log.debug("message end");
		log.debug("调度结束");
		setUserIdAndTokenInCookin(response, msgback);
		return msgback;
	}

	private void setUserIdAndTokenInCookin(HttpServletResponse response, Map msgback) {
		Map<String, String> map = new HashMap<String, String>();
		Object userIdObj = msgback.get("userID");
		Object tokenObj = msgback.get("token");
		boolean isNullUserId = Commons.IsEmptyObj(userIdObj);
		boolean isNullTokenId = Commons.IsEmptyObj(tokenObj);
		if (!(isNullUserId && isNullTokenId)) {
			map.put("userId", userIdObj.toString());
			map.put("tokenUUID", tokenObj.toString());
			try {
				CookieUtil.addCookie(response, "userToken", JSON.toJSONString(map), 604800);
			} catch (UnsupportedEncodingException e) {
				log.debug("用户信息加入Cook失败！！");
			}
		}
	}

	@RequestMapping(value = "viewdispatch.action")
	public ModelAndView getTemplateView(String header, String body, HttpServletRequest request) {
		ModelAndView modelandview = null;
		log.debug("调度开始");
		log.debug("header解析开始");
		Map<String, Object> msgback = new HashMap<String, Object>();
		IViewHandle ih;
		String receive = "";
		try {
			Map headermap = JsonUtil.readJsonToMap(header);
			msgback.put("header", header);
			log.debug("header解析结束");
			log.debug("message start");
			String tokenid = (String) headermap.get(TOKEN);
			String userid = (String) headermap.get(USER_ID);
			String commentid = (String) headermap.get(CMD_ID);
			String devicetype = (String) headermap.get(DEVICE_TYPE);
			log.debug("登陆人:" + userid + ";tokenid:" + tokenid + ";commentid:" + commentid + ";devicetype:" + devicetype);
			if ((devicetype.toLowerCase().equals(ANZ) || devicetype.toLowerCase().equals(IOS)) && !StringUtil.trimIsEmpty(commentid)) {
				try {
					ih = SpringContextHolder.getBean(commentid);
					modelandview = ih.receiveMessage(msgback, body);
					log.debug(receive);
				} catch (Exception e) {
					log.error("业务处理异常" + e);
					msgback.put(ConstantCode.RESCODE, StateCode.PROTOCOL_HANDLE_FALSE_CMDID);
				}
			} else {
				msgback.put(ConstantCode.RESCODE, StateCode.PROTOCOL_HANDLE_FALSE_CMDID);
				log.error("devicetype 或者 comid 为空");
			}
		} catch (Exception e) {
			msgback.put(ConstantCode.RESCODE, StateCode.PROTOCOL_HANDLE_FAIL);
			log.error("系统调度异常" + e);
		}
		log.debug("message end");
		log.debug("调度结束");
		return modelandview;
	}
}

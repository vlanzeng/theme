package com.theme.carmaintain.common.handle;

import java.util.Map;
import org.springframework.web.servlet.ModelAndView;

public interface IViewHandle {
    /***
     * @author Administrator
     * @creaetime 2014年4月30日 下午2:04:26
     * @param msgback 返回给用户的信息
     * @param obj  传递的参数
     * @return
     */
    ModelAndView receiveMessage(Map<String, Object> msgback, Object obj);
}

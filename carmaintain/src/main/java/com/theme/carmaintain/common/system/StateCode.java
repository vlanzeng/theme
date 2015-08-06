/**
 * All rights owned by Niehui Technology
 * File name : com.qttec.msghandle.cons.ErrorCode.java
 */
package com.theme.carmaintain.common.system;

/**
 * <p>
 * Title: StateCode.java
 * </p>
 * <p>
 * Description: 态码的定义
 * </p>
 * <p>
 * Copyright: Niehui Copyright(c)2014
 * </p>
 * <p>
 * Company: 四川臬辉科技有限公司
 * </p>
 * <p>
 * CreateTime:2014年3月31日 下午5:14:00
 * </p>
 * 
 * @author think
 * @version 1.0
 **/
public class StateCode {

	// 接口业务处理错误码定义
	public static final int PROTOCOL_HANDLE_BASE = 10000;

	// 处理成功
	public static final int PROTOCOL_HANDLE_SUCC = PROTOCOL_HANDLE_BASE + 0;

	// token验证未通过
	public static final int PROTOCOL_HANDLE_WARN_UNLOGIN = PROTOCOL_HANDLE_BASE + 2;
	// token为空
	public static final int PROTOCOL_HANDLE_TOKEN_ISNULL = PROTOCOL_HANDLE_BASE + 3;

	// 参数字段有错误
	public static final int PROTOCOL_BODY_PARAMETER_ERROR = PROTOCOL_HANDLE_BASE + 4;
	   // 参数字段有错误cityCode值不正确
    public static final int PROTOCOL_HANDLE_CITYCODE_ERROR = PROTOCOL_HANDLE_BASE + 5;
    
    // 用户不存在
    public static final int PROTOCOL_HANDLE_USER_ISNOTFIND = PROTOCOL_HANDLE_BASE + 6;
	// 处理失败
	public static final int PROTOCOL_HANDLE_FAIL = PROTOCOL_HANDLE_BASE + 9;

	// 无效协议编号
	public static final int PROTOCOL_HANDLE_FALSE_CMDID = PROTOCOL_HANDLE_BASE + 1;

	/**
	 * =============================== 获取商铺！ 协议code：queryShop cmdID= ID0001
	 * =================================
	 */
	/** 获取商铺基础状态码 */
	public static final int QUERYSHOP_BASE = 10010;
	/** 获取商铺成功状态 */
	public static final int QUERYSHOP_SUCCES = QUERYSHOP_BASE + 1;
	/** 无法定位 */
	public static final int QUERYSHOP_UN_LOCATION = QUERYSHOP_BASE + 2;
	/** 获取商铺失败状态 */
	public static final int QUERYSHOP_FAIL = QUERYSHOP_BASE + 9;

	/**
	 * =============================== 获取某一装修步骤下的经营范围！ 协议code：queryBusiness
	 * cmdID= ID0002 =================================
	 */
	/** 获取某一装修步骤下的经营范围 */
	public static final int QUERYBUSINESS_BASE = 10020;
	/** 获取某一装修步骤下的经营范围成功状态 */
	public static final int QUERYBUSINESS_SUCCES = QUERYBUSINESS_BASE + 1;
	/** 获取某一装修步骤下的经营范围失败状态 */
	public static final int QUERYBUSINESS_FAIL = QUERYBUSINESS_BASE + 9;

	/**
	 * =============================== 查询商家经营的分类以及经营分类下的经营内容
	 * 协议code：queryClassificationBusiness cmdID= ID0003
	 * =================================
	 */
	/** 查询商家经营的分类以及经营分类下的经营内容基础状态码 */
	public static final int QUERYCLASSBUS_BASE = 10030;
	/** 查询商家经营的分类以及经营分类下的经营内容成功状态 */
	public static final int QUERYCLASSBUS_SUCCES = QUERYCLASSBUS_BASE + 1;
	/** 查询商家经营的分类以及经营分类下的经营内容失败状态 */
	public static final int QUERYCLASSBUS_FAIL = QUERYCLASSBUS_BASE + 9;

	/**
	 * =============================== 给商家进行星级评价 协议code：ratingOperation cmdID=
	 * ID0004 =================================
	 */
	/** 给商家进行星级评价基础状态码 */
	public static final int RATINGOPERATION_BASE = 10040;
	/** 给商家进行星级评价成功状态 */
	public static final int RATINGOPERATION_SUCCES = RATINGOPERATION_BASE + 1;
	/** 不符合评分的分数段 */
	public static final int RATINGOPERATION_NO_LOCATION_NUM = RATINGOPERATION_BASE + 2;
	/** 不符合评价的内容 */
    public static final int RATINGOPERATION__COMMENT_TO_LONG = RATINGOPERATION_BASE + 3;

	/** 给商家进行星级评价失败状态 */
	public static final int RATINGOPERATION_FAIL = RATINGOPERATION_BASE + 9;
	/**
	 * ===============================
	 * 用于检测在一段时间内（根据需要查询的起始时间到系统当前时间的区间）系统是否有新的消息。 协议code：getNewNoticeSign
	 * cmdID= ID0005 =================================
	 */

	public static final int NEWNOTICESIGN_BASE = 10050;
	/** 获取状态成功 */
	public static final int NEWNOTICESIGN_SUCCES = NEWNOTICESIGN_BASE + 1;
	/** 获取状态失败 */
	public static final int NEWNOTICESIGN_FAIL = NEWNOTICESIGN_BASE + 9;

	/**
	 * =============================== 获取系统消息列表的信息 协议code：querySystemNotice
	 * cmdID= ID0006 =================================
	 */

	public static final int SYSTEMNOTICE_BASE = 10070;
	/** 获取状态成功 */
	public static final int SYSTEMNOTICE_SUCCES = SYSTEMNOTICE_BASE + 1;
	/** 获取状态失败 */
	public static final int SYSTEMNOTICE_FAIL = SYSTEMNOTICE_BASE + 9;

	/**
	 * =============================== 根据手机号码获取短信验证码。 协议code：reqRegSMScode
	 * cmdID= ID0008
	 */
	public static final int REQREGSMSCODE_BASE = 10090;
	/**
	 * 获得验证码成功
	 */
	public static final int REQREGSMSCODE_SUCCES = REQREGSMSCODE_BASE + 1;
	/**
	 * 手机号码已经被注册
	 */
	public static final int REQREGSMSCODE_FAIL = REQREGSMSCODE_BASE + 2;
	/**
	 * 不是有效的手机号码
	 */
	public static final int REQREGSMSCODE_PHON_INVALID = REQREGSMSCODE_BASE + 3;
	/**
	 * 一分钟内重复获取验证码，系统拒绝次操作
	 */
	public static final int REQREGSMSCODE_REQ_REPEAT = REQREGSMSCODE_BASE + 4;

	/**
	 * 系统异常，操作失败！
	 */
	public static final int REQREGSMSCODE_OPERATION_FAIL = REQREGSMSCODE_BASE + 9;

	/**
	 * =============================== 验证验证码是否正确 协议code：checkSMScode cmdID=
	 * ID0009 =================================
	 */
	public static final int CHECKSMSCODE_BASE = 10100;
	/**
	 * 验证码验证成功
	 */
	public static final int CHECKSMSCODE_SUCCES = CHECKSMSCODE_BASE + 1;
	/***
	 * 验证码错误
	 */
	public static final int CHECKSMSCODE_ERROR = CHECKSMSCODE_BASE + 2;
	/***
	 * 验证码已经失效 public static final int CHECKSMSCODE_CODE_INVALID =
	 * CHECKSMSCODE_BASE + 3;
	 */

	/***
	 * 操作失败
	 */
	public static final int CHECKSMSCODE_OPERATION_FAIL = CHECKSMSCODE_BASE + 9;

	/**
	 * =============================== 根据用户自定义的密码完成注册。 协议code：setPassword cmdID=
	 * ID0010 =================================
	 */
	public static final int REGISTE_BASE = 10110;
	/**
	 * 注册成功
	 */
	public static final int REGISTE_SUCCES = REGISTE_BASE + 1;
	/**
	 * 注册失败
	 */
	public static final int REGISTE_FAIL = REGISTE_BASE + 2;
	/**
	 * 密码不符合要求
	 */
	public static final int REGISTE_PWD_ERROR = REGISTE_BASE + 3;
	/**
	 * 系统异常
	 */
	public static final int REGISTE_OPERATION_FAIL = REGISTE_BASE + 9;

	/**
	 * =============================== 用户登录。 协议code：login cmdID= ID0011
	 * =================================
	 */
	public static final int LOGIN_BASE = 10120;
	/**
	 * 登录成功
	 */
	public static final int LOGIN_SUCCES = LOGIN_BASE + 1;
	/**
	 * 用户名不存在
	 */
	public static final int LOGIN_USERNAME_ERROR = LOGIN_BASE + 2;
	/**
	 * 密码不正确
	 */
	public static final int LOGIN_PWD_ERROR = LOGIN_BASE + 3;

	/**
	 * 系统异常
	 */
	public static final int LOGIN_OPERATION_FAIL = LOGIN_BASE + 9;

	/**
	 * =============================== 忘记密码 获取验证码。 协议 code：reqUpdateSMScode
	 * cmdID= ID0023 =================================
	 */
	public static final int REQ_UPDATESMS_CODE_BASE = 10130;
	/**
	 * 获取验证码成功
	 */
	public static final int REQ_UPDATESMS_CODE_SUCCES = REQ_UPDATESMS_CODE_BASE + 1;
	/**
	 * 手机号未注册
	 */
	public static final int REQ_UPDATESMS_CODE_PHONE_ISREG = REQ_UPDATESMS_CODE_BASE + 2;

	/**
	 * 一分钟内重复获取短信验证码
	 */
	public static final int REQ_UPDATESMS_CODE_REPEAT = REQ_UPDATESMS_CODE_BASE + 4;

	/**
	 * 系统异常
	 */
	public static final int REQ_UPDATESMS_CODE_EROR = REQ_UPDATESMS_CODE_BASE + 9;

	/**
	 * =============================== 忘记密码 设置密码。 协议 code：updatePassword cmdID=
	 * ID0024 =================================
	 */
	public static final int UPDATE_PASS_BASE = 10140;
	/**
	 * 重置密码成功
	 */
	public static final int UPDATE_PASS_SUCCES = UPDATE_PASS_BASE + 1;
	/**
	 * 重置密码失败
	 */
	public static final int UPDATE_PASS_FAIL = UPDATE_PASS_BASE + 2;

	/**
	 * 密码不符合要求
	 */
	public static final int UPDATE_PASS_NO_RIGHT = UPDATE_PASS_BASE + 3;

	/**
	 * 系统异常
	 */
	public static final int UPDATE_PASS__EROR = UPDATE_PASS_BASE + 9;

	/**
	 * =============================== 获取知识分类。 协议code：queryKnowledgeType cmdID=
	 * ID0012 =================================
	 */
	public static final int KNOWLEDGDTYPE_BASE = 10150;
	/**
	 * 操作成功
	 */
	public static final int KNOWLEDGDTYPE_SUCCESS = KNOWLEDGDTYPE_BASE + 1;

	/**
	 * 操作异常
	 */
	public static final int KNOWLEDGDTYPE_FAIL = KNOWLEDGDTYPE_BASE + 9;

	/**
	 * =============================== 获取知识分类。 协议code：queryKnowledgeList cmdID=
	 * ID0013 =================================
	 */
	public static final int KNOWLEDGD_BASE = 10160;
	/**
	 * 操作成功
	 */
	public static final int KNOWLEDGD_SUCCESS = KNOWLEDGD_BASE + 1;

	/**
	 * 操作异常
	 */
	public static final int KNOWLEDGD_FAIL = KNOWLEDGD_BASE + 9;

	/**
	 * =============================== 用户反馈信息 协议code：feedback cmdID= ID0015
	 * =================================
	 */

	public static final int FEEDBACK_BASE = 10180;
	/**
	 * 用户反馈成功
	 */
	public static final int FEEDBACK_SUCCESS = FEEDBACK_BASE + 1;
	/***
	 * 用户输入的内容部符合要求
	 */
	public static final int FEEDBACK_CONTEN_ERROR = FEEDBACK_BASE + 2;

	/***
	 * 用户输入的联系方式不符合要求
	 */
	public static final int FEEDBACK_CONTACT_ERROR = FEEDBACK_BASE + 3;

	/**
	 * 操作异常
	 */
	public static final int FEEDBACK_FAIL = FEEDBACK_BASE + 9;

	/**
	 * =============================== 修改个人信息。 协议code：updateUserInfo cmdID=
	 * ID0017 =================================
	 */
	public static final int UPDATE_USER_BASE = 10190;
	/**
	 * 操作成功
	 */
	public static final int UPDATE_USER_SUCCESS = UPDATE_USER_BASE + 1;

	/**
	 * userid为空。
	 */
	public static final int UPDATE_USERID_ISNULL = UPDATE_USER_BASE + 2;

	/**
	 * 用户可能没有登录。
	 */
	public static final int UPDATE_USER_NOLOGIN = UPDATE_USER_BASE + 3;
	/**
	 * 用户名称长度超过30个字符或者汉字。
	 */
	public static final int UPDATE_USERNAME_TOOLONG = UPDATE_USER_BASE + 4;

	/**
	 * 用户地址太长超出了120个字符或者汉字
	 */
	public static final int UPDATE_USERADDRSS_TOOLONG = UPDATE_USER_BASE + 5;

	/**
	 * 操作异常
	 */
	public static final int UPDATE_USER_FAIL = UPDATE_USER_BASE + 9;

	/**
	 * =============================== 获取效果图集。 协议code：queryRenderings cmdID=
	 * ID0018 =================================
	 */
	public static final int RENDERINGS_BASE = 10200;
	/**
	 * 操作成功
	 */
	public static final int RENDERINGS_SUCCESS = RENDERINGS_BASE + 1;

	/**
	 * 操作异常
	 */
	public static final int RENDERINGS_FAIL = RENDERINGS_BASE + 9;

	/**
	 * =============================== 设计师，原图点赞 协议code：goodPoint cmdID= ID0020
	 */

	public static final int GOODPOINT_BASE = 10220;
	/**
	 * 10221操作成功
	 */
	public static final int GOODPOINT_SUCCESS = GOODPOINT_BASE + 1;

	/**
	 * 10229操作失败
	 */
	public static final int GOODPOINT_FAIL = GOODPOINT_BASE + 9;

	/**
	 * =============================== 设计师详情 协议code：ShowInfoDesigner cmdID=
	 * ID0021
	 */

	public static final int SHOW_DESIGNER_BASE = 10230;
	/**
	 * 10231操作成功
	 */
	public static final int SHOW_DESIGNER_SUCCESS = SHOW_DESIGNER_BASE + 1;

	/**
	 * 10232没有查询到相应的设计师信息
	 */
	public static final int SHOW_DESIGNER_NOT_FIND_DESIGNER = SHOW_DESIGNER_BASE + 2;

	/**
	 * 10239操作失败
	 */
	public static final int SHOW_DESIGNER_FAIL = SHOW_DESIGNER_BASE + 9;

	/**
	 * =============================== 查询效果图风格 协议code：queryRenderingsType cmdID=
	 * ID0022 =================================
	 */
	public static final int RenderingFrame_BASE = 10240;
	/** 操作成功 */
	public static final int RenderingFrame_SUCCES = RenderingFrame_BASE + 1;
	/* 操作失败* */
	public static final int RenderingFrame_FAIL = RenderingFrame_BASE + 9;

	/**
	 * =============================== 日志操作类型！ 协议code：getLogType cmdID= ID0025
	 * =================================
	 */

	/**
	 * =============================== 获取是否评价过商铺状态 协议code：getGradeState cmdID=
	 * ID0027 =================================
	 */
	/** 获取是否评价过商铺础状态码 */
	public static final int GRADESTATE_BASE = 10270;
	/** 获取是否评价过商铺成功状态 */
	public static final int GRADESTATE_SUCCES = GRADESTATE_BASE + 1;
	/** 获取是否评价过商铺失败状态 */
	public static final int GRADESTATE_FAIL = GRADESTATE_BASE + 9;

	/**
	 * =============================== 查询小工工种类型列表 协议code：queryJobScope cmdID=
	 * ID0028 =================================
	 */

	/** 查询小工工种类型列表础状态码 */
	public static final int JOBSCOPE_BASE = 10280;
	/** 查询小工工种类型成功状态 */
	public static final int JOBSCOPE_SUCCES = JOBSCOPE_BASE + 1;
	/** 查询小工工种类型失败状态 */
	public static final int JOBSCOPE_FAIL = JOBSCOPE_BASE + 9;

	/**
	 * =============================== 成都行政区域查询 协议code：queryAdministrativeArea
	 * cmdID= ID0029 =================================
	 */

	/** 查询区域础状态码 */
	public static final int AREA_BASE = 10290;
	/** 查询区域成功状态 */
	public static final int AREA_SUCCES = AREA_BASE + 1;
	/** 查询区域失败状态 */
	public static final int AREA_FAIL = AREA_BASE + 9;

	/**
	 * =============================== 查询小工列表 协议code：queryWorkersList cmdID=
	 * ID0030 =================================
	 */

	/** 查询区域础状态码 */
	public static final int QUERYWORKER_BASE = 10300;
	/** 查询区域成功状态 */
	public static final int QUERYWORKER_SUCCES = QUERYWORKER_BASE + 1;
	/** 无法定位 */
	public static final int QUERYWORKER_NOLOCATE = QUERYWORKER_BASE + 2;
	/** 查询区域失败状态 */
	public static final int QUERYWORKER_FAIL = QUERYWORKER_BASE + 9;

	/**
	 * =============================== 地图查询 协议code：QueryWorkersMap cmdID= ID0031
	 * =================================
	 */

	/** 地图查询的基础码 */
	public static final int QUERYWORKERMAP_BASE = 10310;
	/** 地图查询成功状态 */
	public static final int QUERYWORKERMAP_SUCCES = QUERYWORKERMAP_BASE + 1;
	/** 地图查询失败状态 */
	public static final int QUERYWORKERMAP_FAIL = QUERYWORKERMAP_BASE + 9;

	/**
	 * =============================== 地图查询 协议code：SendPhoneRecords cmdID=
	 * ID0032 =================================
	 */

	/** 地图查询的基础码 */
	public static final int SendPhoneRecords_BASE = 10320;
	/** 地图查询成功状态 */
	public static final int SendPhoneRecords_SUCCES = SendPhoneRecords_BASE + 1;
	/** 地图查询失败状态 */
	public static final int SendPhoneRecords_FAIL = SendPhoneRecords_BASE + 9;

	/**
	 * =============================== 评星接口(3:小工,4:工长) 协议code：newRatingOperation
	 * cmdID= ID0033 =================================
	 */

	/** 评星表础状态码 */
	public static final int N_RATINGOPERATION_BASE = 10330;
	/** 评星成功状态 */
	public static final int N_RATINGOPERATION_SUCCES = N_RATINGOPERATION_BASE + 1;
	/** 不符合评分的分数段状态 */
	public static final int N_RATINGOPERATION_UNNUM = N_RATINGOPERATION_BASE + 2;
	/** 已经评过分 */
	public static final int N_RATINGOPERATION_YET = N_RATINGOPERATION_BASE + 3;
	/** 评星类型错误 */
	public static final int N_RATINGOPERATION_TYPE_ERROR = N_RATINGOPERATION_BASE + 4;
	/** 评分失败 */
	public static final int N_RATINGOPERATION_FAIL = N_RATINGOPERATION_BASE + 9;

	/**
	 * =============================== 评星状态(3:小工,4:工长) 协议code：getFWGradeState
	 * cmdID= ID0034 =================================
	 */

	/** 评星状态表础状态码 */
	public static final int GETGRADESTATE_BASE = 10340;
	/** 评星状态成功状态 */
	public static final int GETGRADESTATE_SUCCES = GETGRADESTATE_BASE + 1;
	/** 评星状态类型错误 */
	public static final int GETGRADESTATE_TYPE_ERROR = GETGRADESTATE_BASE + 2;
	/** 评星失败 */
	public static final int GETGRADESTATE_FAIL = GETGRADESTATE_BASE + 9;

	/**
	 * =============================== 工长列表 协议code：foremanList cmdID= ID0035
	 * =================================
	 */

	/** 工长列表础状态码 */
	public static final int FOREMANLIST_BASE = 10350;
	/** 工长列表成功状态 */
	public static final int FOREMANLIST_SUCCES = FOREMANLIST_BASE + 1;
	/** 工长列表失败 */
	public static final int FOREMANLIST_FAIL = FOREMANLIST_BASE + 9;

	// //////////////////////////////////////////
	/**
	 * =============================== 日志记录 协议code：crashLog cmdID= ID0019
	 * 
	 */
	/** 日志记录基础状态码 */
	public static final int CRASHLOGCODE_BASE = 10210;
	/** 日志记录成功状态 */
	public static final int CRASHLOGCODE_SUCCES = CRASHLOGCODE_BASE + 1;
	/** 日志记录失败状态 */
	public static final int CRASHLOGCODE_FAIL = CRASHLOGCODE_BASE + 9;

	/**
	 * =============================== 日志记录 协议code：getLogType cmdID= ID0025
	 * =================================
	 */
	/** 日志记录基础状态码 */
	public static final int LOGTYPE_BASE = 10250;
	/** 日志记录成功状态 */
	public static final int LOGTYPE_SUCCES = LOGTYPE_BASE + 1;
	/** 日志记录失败状态 */
	public static final int LOGTYPE_FAIL = LOGTYPE_BASE + 9;

	/**
	 * =============================== 获取投诉电话 协议code：queryFBPhoneNumber cmdID=
	 * ID0036 =================================
	 */
	/** 获取投诉电话状态码 */
	public static final int FB_PHONENUMBER_BASE = 10360;
	/** 获取投诉电话成功状态 */
	public static final int FB_PHONENUMBER_SUCCES = FB_PHONENUMBER_BASE + 1;
	/** 获取投诉电话失败 */
	public static final int FB_PHONENUMBER_FAIL = FB_PHONENUMBER_BASE + 9;

	/**
	 * =============================== 获取投诉电话 协议code：publishRenovation cmdID=
	 * ID0044 =================================
	 */

	/** 发布装修信息表础状态码 */
	public static final int PUBLISHRENOVATION_BASE = 10440;
	/** 发布装修信息成功状态 */
	public static final int PUBLISHRENOVATION_SUCCES = PUBLISHRENOVATION_BASE + 1;
	/** 发布装修信息失败 */
	public static final int PUBLISHRENOVATION_FAIL = PUBLISHRENOVATION_BASE + 9;

	/**
	 * =============================== 获取投诉电话 协议code：queryRenovationList cmdID=
	 * ID0045 =================================
	 */

	/** 查询装修信息础状态码 */
	public static final int QUERYRENOVATIONLIST_BASE = 10450;
	/** 查询装修信息列表成功状态 */
	public static final int QUERYRENOVATIONLIST_SUCCES = QUERYRENOVATIONLIST_BASE + 1;
	/** 查询装修信息列表失败 */
	public static final int QUERYRENOVATIONLIST_FAIL = QUERYRENOVATIONLIST_BASE + 9;
    
	 /**
     * 
     * ID0046==设计师列表
     */

    /** 查询设计师列表础状态码 */
    public static final int DESIGNERLIST_BASE = 10460;
    /** 查询设计师列表成功状态 */
    public static final int DESIGNERLIST_SUCCES = DESIGNERLIST_BASE + 1;
    /** 查询设计师列表失败 */
    public static final int DESIGNERLIST_FAIL = DESIGNERLIST_BASE + 9;

	
	/**
	 * =============================== 查询小工，商家，设计师评价列表 协议code：queryROList cmdID=
	 * ID0037 =================================
	 */
	/** 评价列表础状态码 */
	public static final int QUSERYROLIST_BASE = 10370;
	/** 查询列表成功状态 */
	public static final int QUSERYROLIST_SUCCES = QUSERYROLIST_BASE + 1;
	/** 查询列表失败 */
	public static final int QUSERYROLIST_FAIL = QUSERYROLIST_BASE + 9;

	/**
	 * =============================== 查询城市列表 协议code：queryCityList cmdID= ID0041
	 * =================================
	 */
	/** 查询城市列表础状态码 */
	public static final int QUERYCITYLIST_BASE = 10410;
	/** 查询城市列表成功状态 */
	public static final int QUERYCITYLIST_SUCCES = QUERYCITYLIST_BASE + 1;
	/** 查询城市列表失败 */
	public static final int QUERYCITYLIST_FAIL = QUERYCITYLIST_BASE + 9;

	/**
	 * =============================== 查询城市列表 协议code：queryCountyList cmdID=
	 * ID0042 =================================
	 */
	/** 查询城市下的区域列表础状态码 */
	public static final int QUERYCOUNTYLIST_BASE = 10420;
	/** 查询城市下的区域列表成功状态 */
	public static final int QUERYCOUNTYLIST_SUCCES = QUERYCOUNTYLIST_BASE + 1;
	/** 查询城市下的区域列表失败 */
	public static final int QUERYCOUNTYLIST_FAIL = QUERYCOUNTYLIST_BASE + 9;
	
	
	/**
     * =============================== 查询城市列表 协议GetAds cmdID=
     * ID0043 =================================
     */
    /** 查询城市下的区域列表础状态码 */
    public static final int GETADS_BASE = 10430;
    /** 查询城市下的区域列表成功状态 */
    public static final int GETADS_SUCCES = GETADS_BASE + 1;
    /** 查询城市下的区域列表失败 */
    public static final int GETADS_FAIL = GETADS_BASE + 9;
	
	

	/**
	 * =============================== 查询城市列表 协议code：queryBannerList cmdID=
	 * ID0040 =================================
	 */
	/** 查询城市下的区域列表础状态码 */
	public static final int QUERYBANNERLIST_BASE = 10400;
	/** 查询城市下的区域列表成功状态 */
	public static final int QUERYBANNERLIST_SUCCES = QUERYBANNERLIST_BASE + 1;
	/** 查询城市下的区域列表失败 */
	public static final int QUERYBANNERLIST_FAIL = QUERYBANNERLIST_BASE + 9;

	/**
	 * =============================== 收藏量+1 协议code：collectionUp cmdID= ID0039
	 * =================================
	 */
	/** 热点+1基础状态码 */
	public static final int CollectionUp_BASE = 10390;
	/** 热点+1成功 */
	public static final int CollectionUp_SUCCES = CollectionUp_BASE + 1;
	/** 热店+1失败 */
	public static final int CollectionUp_FAIL = CollectionUp_BASE + 9;

	/**
	 * =============================== 浏览量+1 协议code：collectionUp cmdID= ID0038
	 * =================================
	 */
	/** 热点+1基础状态码 */
	public static final int PageViewUp_BASE = 10380;
	/** 热点+1成功 */
	public static final int PageViewUp_SUCCES = PageViewUp_BASE + 1;
	/** 热店+1失败 */
	public static final int PageViewUp_FAIL = PageViewUp_BASE + 9;
	
	/***
	 * ====个人中心用户修改密码====
	 */
	/** 修改密码基础状态码 */
    public static final int UPDATE_USER_PWD_BASE = 10470;
    /** 修改密码成功 */
    public static final int UPDATE_USER_PWD_SUCCES = UPDATE_USER_PWD_BASE + 1;
    /** 修改密码失败 */
    public static final int UPDATE_USER_PWD_ERROR = UPDATE_USER_PWD_BASE + 2;
    /** 密码不符合要求*/
    public static final int UPDATE_USER_PWD_PWDINVALID = UPDATE_USER_PWD_BASE + 3;
    /** 修改密码错误 */
    public static final int UPDATE_USER_PWD_FAIL = UPDATE_USER_PWD_BASE + 9;
    
    /***
     * ====获取已经发布的有效的装修信息的总数====
     */
    public static final int QUERY_RENOVATION_COUNT_BASE = 10480;
    /** 成功 */
    public static final int QUERY_RENOVATION_COUNT_SUCCES = QUERY_RENOVATION_COUNT_BASE + 1;
    /** 错误 */
    public static final int QUERY_RENOVATION_COUNT_FAIL = QUERY_RENOVATION_COUNT_BASE + 9;


    
    /**
     * =============================== 根据手机号码获取短信验证码。 协议code：reqRegSMScode
     * cmdID= ID0082
     */
    public static final int REQREGSMSCODESP_BASE = 10820;
    /**
     * 获得验证码成功
     */
    public static final int REQREGSMSCODESP_SUCCES = REQREGSMSCODESP_BASE + 1;
    /**
     * 手机号码已经被注册
     */
    public static final int REQREGSMSCODESP_FAIL = REQREGSMSCODESP_BASE + 2;
    /**
     * 不是有效的手机号码
     */
    public static final int REQREGSMSCODESP_PHON_INVALID = REQREGSMSCODESP_BASE + 3;
    /**
     * 一分钟内重复获取验证码，系统拒绝次操作
     */
    public static final int REQREGSMSCODESP_REQ_REPEAT = REQREGSMSCODESP_BASE + 4;

    /**
     * 系统异常，操作失败！
     */
    public static final int REQREGSMSCODESP_OPERATION_FAIL = REQREGSMSCODESP_BASE + 9;

    
    /**
     * =============================== 根据用户自定义的密码完成注册。 协议code：setPassword cmdID=
     * ID0049 =================================
     */
    public static final int REGISTE_SP_BASE = 10490;
    /**
     * 注册成功
     */
    public static final int REGISTE_SP_SUCCES = REGISTE_SP_BASE + 1;
    /**
     * 注册失败
     */
    public static final int REGISTE_SP_FAIL = REGISTE_SP_BASE + 2;
    /**
     * 密码不符合要求
     */
    public static final int REGISTE_SP_PWD_ERROR = REGISTE_SP_BASE + 3;
    
    /**
     * 手机号码已经被注册过了
     */
    public static final int REGISTE_SP_MOBILE_ISREGED = REGISTE_SP_BASE + 4;
    
    /**
     * 手机号码已经被注册过了
     */
    public static final int REGISTE_SP_ROLEID_ERROR = REGISTE_SP_BASE + 5;
    /**
     * 系统异常
     */
    public static final int REGISTE_SP_OPERATION_FAIL = REGISTE_SP_BASE + 9;
    
    
    
    /**
     * =============================== sp用户登录。 协议code：login cmdID= ID0050
     * =================================
     */
    public static final int LOGIN_SP_BASE = 10500;
    /**
     * 登录成功
     */
    public static final int LOGIN_SP_SUCCES = LOGIN_SP_BASE + 1;
    /**
     * 用户名不存在
     */
    public static final int LOGIN_SP_USERNAME_ERROR = LOGIN_SP_BASE + 2;
    /**
     * 密码不正确
     */
    public static final int LOGIN_SP_PWD_ERROR = LOGIN_SP_BASE + 3;
    
    /**
     * 角色不符合要求（目前只支持工长，监理，设计师）
     */
    public static final int LOGIN_SP_ROLE_ERROR = LOGIN_SP_BASE + 4;

    /**
     * 系统异常
     */
    public static final int LOGIN_SP_OPERATION_FAIL = LOGIN_SP_BASE + 9;
    
    
    
    /**
     * =============================== sp忘记密码。 
     * 协议code：reqUpdateSMScodeSP cmdID= ID0051
     * =================================
     */
    public static final int REQUPDATESMSCODE_SP_BASE = 10510;
    /**
     * 获取验证码成功
     */
    public static final int REQUPDATESMSCODE_SP_SUCCES = REQUPDATESMSCODE_SP_BASE + 1;
    /**
     * 手机号码未注册
     */
    public static final int REQUPDATESMSCODE_SP_MOBILEISNOTREG = REQUPDATESMSCODE_SP_BASE + 2;
    /**
     * 不是有效手机号码
     */
    public static final int REQUPDATESMSCODE_SP_MOBILEISFAIL = REQUPDATESMSCODE_SP_BASE + 3;

    /**
     * 一分钟内重复获取验证码
     */
    public static final int REQUPDATESMSCODE_SP_AGIN = REQUPDATESMSCODE_SP_BASE + 4;
    
    
    /**
     * 系统异常
     */
    public static final int REQUPDATESMSCODE_SP_OPERATION_FAIL = REQUPDATESMSCODE_SP_BASE + 9;
    
    /***==================
     * sp用户修改密码。协议code：checkSMScodeSP cmdID= ID0052
     * =====================
     */
    public static final int CHECKSMSCODE_SP_BASE = 10520;
    
    /**
     * 修改密码成功
     */
    public static final int CHECKSMSCODE_SP_SUCCESS = CHECKSMSCODE_SP_BASE+1;
    
    /**
     * 修改密码失败
     */
    public static final int CHECKSMSCODE_SP_FAIL = CHECKSMSCODE_SP_BASE+2;
    /**
     * 修改密码不符合要求
     */
    public static final int CHECKSMSCODE_SP_PWD_INVALID = CHECKSMSCODE_SP_BASE+3;
    
    /**
     * 系统异常
     */
    public static final int CHECKSMSCODE_SP_ERROR = CHECKSMSCODE_SP_BASE+9;
    /**
     * 订单，商家处理-开始施工-操作成功
     */
    public static final int QUERY_ORDER_BUILDING_SUCCESS = 10571;
    /**
     * 订单，商家处理-开始施工-操作失败
     */
    public static final int QUERY_ORDER_BUILDING_FAIL = 10579;
    /**
     * 订单，商家处理-申请付款-操作成功
     */
    public static final int QUERY_ORDER_WAIT_PAY_SUCCESS = 10581;
    /**
     * 订单，商家处理-申请付款-操作失败
     */
    public static final int QUERY_ORDER_WAIT_PAY_FAIL = 10589;
    /**
     * 订单，商家处理-退款申请-操作成功
     */
    public static final int QUERY_REFUND_PAY_SUCCESS = 10591;
    /**
     * 订单，商家处理-退款申请-操作失败
     */
    public static final int QUERY_REFUND_PAY_FAIL = 10599;
    /**
     * 订单，用户处理-拒绝付款-操作成功
     */
    public static final int QUERY_ORDER_REFUSE_PAY_SUCCESS = 10211;
    /**
     * 订单，用户处理-拒绝付款-操作失败
     */
    public static final int QUERY_ORDER_REFUSE_PAY_FAIL = 10219;
    /**
     * 预约状态-成功
     */
    public static final int QUERY_BOOKING_SUCCESS = 10701;
    /**
     * 预约状态-错误
     */
    public static final int QUERY_BOOKING_FAIL = 10709;
    /**
     * 客户端--列表订单消息-成功
     */
    public static final int QUERY_ORDERMSG_SUCCESS = 10071;
    /**
     * 客户端--列表订单消息-失败
     */
    public static final int QUERY_ORDERMSG_FAIL = 10079;
    /**
     * 客户端-预约状态-成功
     */
    public static final int QUERY_CLIENT_BOOKING_SUCCESS = 10601;
    /**
     * 客户端-预约状态-错误
     */
    public static final int QUERY_CLIENT_BOOKING_FAIL = 10609;
    /**
     * 预约-操作成功
     */
    public static final int UPDATE_BOOKING_SUCCESS = 10721;
    /**
     * 预约-操作失败
     */
    public static final int UPDATE_BOOKING_FAIL = 10729;
    
    /**
     * 合同--操作成功
     */
    public static final int UPDATE_CONTRACTINFO_SUCCESS = 10711;
    /**
     * 合同--操作失败
     */
    public static final int UPDATE_CONTRACTINFO_FAIL = 10719;
    
    /**
     * =============================== 
     *  查询认证信息的状态 协议 code:getIdentityAuthState cmdID= ID0089
     * =================================
     */

    public static final int GETIDENTITYAUTHSTATE_BASE = 10890;
    /**
     * 操作成功
     */
    public static final int GETIDENTITYAUTHSTATE_SUCCESS = GETIDENTITYAUTHSTATE_BASE + 1;

    /**
     * 系统异常
     */
    public static final int GETIDENTITYAUTHSTATE_ERROR = GETIDENTITYAUTHSTATE_BASE + 9;
    
    //--------------订单操作--------------
    /**
     * 订单确认，拒绝，确定-成功
     */
    public static final int ORDER_CONTRACT_SUCCESS = 101131;
    /**
     * 订单确认，拒绝，确定-错误
     */
    public static final int ORDER_CONTRACT_FAIL = 101139;
    /**
     * 售后单，受理、拒绝售后申请-成功
     */
    public static final int SERVICE_SP_SUCCESS = 10631;
    /**
     * 售后单，受理、拒绝售后申请-错误
     */
    public static final int SERVICE_SP_FAIL = 10639;
    /***==================
     * sp修改业务信息。协议code：reqBusinessInfoSP cmdID= ID0078
     * =====================
     */
    public static final int REQBUSINESSINFO_SP_BASE = 10780;
    
    /**
     * 修该业务信息成功
     */
    public static final int REQBUSINESSINFO_SP_SUCCESS = REQBUSINESSINFO_SP_BASE+1;
    
    /**
     * 简介长度超出字数限制
     */
    public static final int REQBUSINESSINFO_SP_DESC_TOLONG = REQBUSINESSINFO_SP_BASE+2;
    /**
     * 地址长度超出字数限制
     */
    public static final int REQBUSINESSINFO_SP_ADDRESS_TOLONG = REQBUSINESSINFO_SP_BASE+3;
    
    /**
     * 代表作品长度超出字数限制
     */
    public static final int REQBUSINESSINFO_SP_WORK_TOLONG = REQBUSINESSINFO_SP_BASE+4;
    
    /**
     * 操作失败
     */
    public static final int REQBUSINESSINFO_SP_FAIL = REQBUSINESSINFO_SP_BASE+5;
    
    /**
     * 系统异常
     */
    public static final int REQBUSINESSINFO_SP_ERROR = REQBUSINESSINFO_SP_BASE+9;
    
    /***==================
     * sp修改开户信息时验证密码。协议code：reqBusinessInfoSP cmdID= ID0080
     * =====================
     */
    public static final int VERIFYPASSWORD_SP_BASE = 10800;
    
    /**
     * 密码验证通过
     */
    public static final int VERIFYPASSWORD_SP_SUCCESS = VERIFYPASSWORD_SP_BASE+1;
    
    /**
     * 密码验证未通过
     */
    public static final int VERIFYPASSWORD_SP_PWDERROR = VERIFYPASSWORD_SP_BASE+2;
    
    /**
     * 系统异常
     */
    public static final int VERIFYPASSWORD_SP_SYSERROR = VERIFYPASSWORD_SP_BASE+9;
    
    /***==================
     * sp查询开户信息。协议code：queryBankCardSP cmdID= ID0083
     * =====================
     */
    public static final int QUERYBANKCARD_SP_BASE = 10830;
    
    /**
     * 密码验证通过
     */
    public static final int QUERYBANKCARD_SP_SUCCESS = QUERYBANKCARD_SP_BASE+1;
    
    /**
     * 系统异常
     */
    public static final int QUERYBANKCARD_SP_FAIL = QUERYBANKCARD_SP_BASE+9;
    
    
    /***==================
     * sp编辑银行信息。协议code：setBankCardSP cmdID= ID0081
     * =====================
     */
    public static final int  SETBANKCARD_SP_BASE = 10810;
    
    /**
     * 修改银行信息成功
     */
    public static final int SETBANKCARD_SP_SUCCESS = SETBANKCARD_SP_BASE+1;
    /**
     * 不为空的字段没有填写信息
     */
    public static final int SETBANKCARD_SP_NOTNULL = SETBANKCARD_SP_BASE+2;
    /**
     * 银行卡类型错误 目前只支持 中国农业银行 1
     */
    public static final int SETBANKCARD_SP_CARDTYPE_ERROR = SETBANKCARD_SP_BASE+3;
    
    /**
     * 操作失败
     */
    public static final int SETBANKCARD_SP_FAIL = SETBANKCARD_SP_BASE+9;
    
    
    /***==================
     * sp编辑银行信息。协议code：getTheCitySP cmdID= ID0066
     * =====================
     */
    public static final int  GETTHECITY_SP_BASE = 10660;
    
    /**
     * 查询成功
     */
    public static final int GETTHECITY_SP_SUCCESS = GETTHECITY_SP_BASE+1;
    /**
     * 查询失败
     */
    public static final int GETTHECITY_SP_FAIL = GETTHECITY_SP_BASE+9;
    
    
    /***==================
     * sp编辑银行信息。协议code：openOrClosedBookSP cmdID= ID0079
     * =====================
     */
    public static final int  OPENORCLOSEDBOOK_SP_BASE = 10790;
     
    /**
     * 查询成功
     */
    public static final int OPENORCLOSEDBOOK_SP_SUCCESS = OPENORCLOSEDBOOK_SP_BASE+1;
    
    /**
     * 预约状态不在指定范围呢
     */
    public static final int OPENORCLOSEDBOOK_SP_ISORDER_ERROR = OPENORCLOSEDBOOK_SP_BASE+2;
    
    /**
     * 用户还没有完善业务信息,不能进行开启/关闭预约的操作
     */
    public static final int OPENORCLOSEDBOOK_SP_ISNOTBUSINESS = OPENORCLOSEDBOOK_SP_BASE+3;
    
    /**
     * 查询失败
     */
    public static final int OPENORCLOSEDBOOK_SP_FAIL = OPENORCLOSEDBOOK_SP_BASE+9;
    
    
    /**
     * =============================== 
     * 服务商反馈信息 协议code：feedbackSP cmdID= ID0074
     * =================================
     */

    public static final int FEEDBACK_SP_BASE = 10740;
    /**
     * 用户反馈成功
     */
    public static final int FEEDBACK_SP_SUCCESS = FEEDBACK_SP_BASE + 1;
    /***
     * 用户输入的内容部符合要求
     */
    public static final int FEEDBACK_SP_CONTEN_ERROR = FEEDBACK_SP_BASE + 2;

    /***
     * 用户输入的联系方式不符合要求
     */
    public static final int FEEDBACK_SP_CONTACT_ERROR = FEEDBACK_SP_BASE + 3;

    /**
     * 操作异常
     */
    public static final int FEEDBACK_SP_FAIL = FEEDBACK_SP_BASE + 9;
    
    
    
    /**
     * =============================== 
     * 服务商反馈信息 协议code：queryBusinessInfoSP cmdID= ID0084
     * =================================
     */

    public static final int INTQUERYBUSINESSINFO_SP_BASE = 10840;
    /**
     * 查询成功
     */
    public static final int INTQUERYBUSINESSINFO_SUCCESS = INTQUERYBUSINESSINFO_SP_BASE + 1;
    /***
     * 没有查询到对应的业务信息。
     */
    public static final int INTQUERYBUSINESSINFO_ERROR = INTQUERYBUSINESSINFO_SP_BASE + 2;

    /**
     * 操作异常
     */
    public static final int INTQUERYBUSINESSINFO_SP_FAIL = INTQUERYBUSINESSINFO_SP_BASE + 9;
    
    /**
     * =============================== 
     * 服务商反馈信息 协议 code:queryOrdersSP cmdID= ID0054
     * =================================
     */

    public static final int QUERYORDERS_SP_BASE = 10540;
    /**
     * 查询成功
     */
    public static final int QUERYORDERS_SP_SUCCESS = QUERYORDERS_SP_BASE + 1;

    /**
     * 查询失败
     */
    public static final int QUERYORDERS_SP_FAIL = QUERYORDERS_SP_BASE + 9;
    /**
     * 监理列表--操作成功
     */
    public static int SUPERVISION_SUCCESS = 10461;
    /**
     * 监理列表--操作失败
     */
    public static int SUPERVISION_FAIL = 10469;
    /**
     * 成功
     */
    public static int REP_SUCCESS = 1;
    /**
     * 失败
     */
    public static int REP_FAIL = 0;
    
    /**
     * =============================== 
     *  sp查询订单详细信息协议 code:queryOrderInfoSP cmdID= ID0055
     * =================================
     */

    public static final int QUERYORDERINFO_SP_BASE = 10550;
    /**
     * 查询成功
     */
    public static final int QUERYORDERINFO_SP_SUCCESS = QUERYORDERINFO_SP_BASE + 1;
    
    /**
     * 没有查询到订单详情
     */
    public static final int QUERYORDERINFO_SP_NOFIND = QUERYORDERINFO_SP_BASE + 2;

    
    /**
     * 查询失败
     */
    public static final int QUERYORDERINFO_SP_FAIL = QUERYORDERINFO_SP_BASE + 9;
    
    
    /**
     * =============================== 
     *  sp查询售后申请列表协议 code:queryCustomerServicesSP cmdID= ID0056
     * =================================
     */

    public static final int QUERYCUSTOMERSERVICES_SP_BASE = 10560;
    /**
     * 查询成功
     */
    public static final int QUERYCUSTOMERSERVICES_SP_SUCCESS = QUERYCUSTOMERSERVICES_SP_BASE + 1;
    
    /**
     * 查询失败
     */
    public static final int QUERYCUSTOMERSERVICES_SP_FAIL = QUERYCUSTOMERSERVICES_SP_BASE + 9;

    /**
     * =============================== 
     *  sp查询服务商的评论信息列表  协议 code:queryCommentsListSP cmdID= ID0073
     * =================================
     */

    public static final int QUERYCOMMENTSLIST_SP_BASE = 10730;
    /**
     * 查询成功
     */
    public static final int QUERYCOMMENTSLIST_SP_SUCCESS = QUERYCOMMENTSLIST_SP_BASE + 1;
    
    /**
     * 登录用户角色不再允许的范围内
     */
    public static final int QUERYCOMMENTSLIST_SP_ROLEERROR = QUERYCOMMENTSLIST_SP_BASE + 2;
    
    /**
     * 查询失败
     */
    public static final int QUERYCOMMENTSLIST_SP_FAIL = QUERYCOMMENTSLIST_SP_BASE + 9;
    
    
    
    /**
     * =============================== 
     *  sp用户修改手机号码  协议 code:updateMobileSPGetSMS cmdID= ID0076
     * =================================
     */

    public static final int UPDATEMOBILE_SP_BASE = 10760;
    /**
     * 注册成功
     */
    public static final int UPDATEMOBILE_SP_SUCCESS = UPDATEMOBILE_SP_BASE + 1;
    
    /**
     * 手机号码不符合要求
     */
    public static final int UPDATEMOBILE_SP_MOBILE_IS_INVALID  = UPDATEMOBILE_SP_BASE + 2;
    /**
     * 旧的手机号码未注册
     */
    public static final int UPDATEMOBILE_SP_MOBILE_IS_NOT_REG = UPDATEMOBILE_SP_BASE + 3;
    
    /**
     * 新的手机号码已注册
     */
    public static final int UPDATEMOBILE_SP_MOBILE_IS_REGED = UPDATEMOBILE_SP_BASE + 4;
    
    /**
     * 一分钟内重复获取验证码，系统拒绝次操作
     */
    public static final int UPDATEMOBILE_SP_MOBILE_IS_AGIN = UPDATEMOBILE_SP_BASE + 5;
    
    /**
     *注册失败
     */
    public static final int UPDATEMOBILE_SP_FAIL = UPDATEMOBILE_SP_BASE + 9;
    
    
    
    
    
    
    
    /**
     * =============================== 
     *  身份认证信息  协议 code:identityAuthentication cmdID= ID0077
     * =================================
     */

    public static final int IDENTITYAUTHEN_SP_BASE = 10770;
    /**
     * 认证成功
     */
    public static final int IDENTITYAUTHEN_SP_SUCCESS = IDENTITYAUTHEN_SP_BASE + 1;
    
    /**
     * 用户姓名 不符合要求
     */
    public static final int IDENTITYAUTHEN_SP_USERNAMEERROR = IDENTITYAUTHEN_SP_BASE + 2;
    /**
     * 身份证号不符合要求
     */
    public static final int IDENTITYAUTHEN_SP_IDCARDFAIL = IDENTITYAUTHEN_SP_BASE + 3;
    
    /**
     * 申请认证失败
     */
    public static final int IDENTITYAUTHEN_SP_FAIL = IDENTITYAUTHEN_SP_BASE + 9;
    
    /**
     * =============================== 
     *  修改手机号码sp  协议 code:updateMobileSP cmdID= ID0085
     * =================================
     */

    public static final int UPDATEMOBILE_SMS_SP_BASE = 10850;
    /**
     * 修改成功
     */
    public static final int UPDATEMOBILE_SMS_SP_SUCCESS = UPDATEMOBILE_SMS_SP_BASE + 1;
    
    /**
     * 修改失败
     */
    public static final int UPDATEMOBILE_SMS_SP_USERNAMEERROR = UPDATEMOBILE_SMS_SP_BASE + 2;
    /**
     * 短信验证没有通过
     */
    public static final int UPDATEMOBILE_SMS_SP_IDCARDFAIL = UPDATEMOBILE_SMS_SP_BASE + 3;
    
    /**
     * 系统异常
     */
    public static final int UPDATEMOBILE_SMS_SP_ERROR = UPDATEMOBILE_SMS_SP_BASE + 9;
    
    /**
     * =============================== 
     *  修改密码sp  协议 code:updatePwdSp cmdID= ID0086
     * =================================
     */

    public static final int UPDATEPWD_SP_BASE = 10860;
    /**
     * 修改成功
     */
    public static final int UPDATEPWD_SP_SUCCESS = UPDATEPWD_SP_BASE + 1;
    
    /**
     * 密码不符合要求不能为空且是32位定长
     */
    public static final int UPDATEPWD_SP_PWDINVALID = UPDATEPWD_SP_BASE + 2;
    /**
     * 旧密码不正确
     */
    public static final int UPDATEPWD_SP_PWDERROR = UPDATEPWD_SP_BASE + 3;
    
    /**
     * 系统异常
     */
    public static final int UPDATEPWD_SP_ERROR = UPDATEPWD_SP_BASE + 9;
    
    /**
     * =============================== 
     *  修改用户头像sp  协议 code:updateSPUserLogo cmdID= ID0087
     * =================================
     */

    public static final int UPDATESPUSERLOGO_SP_BASE = 10870;
    /**
     * 修改成功
     */
    public static final int UPDATESPUSERLOGO_SP_SUCCESS = UPDATESPUSERLOGO_SP_BASE + 1;
    
    /**
     * 系统异常
     */
    public static final int UPDATESPUSERLOGO_SP_ERROR = UPDATESPUSERLOGO_SP_BASE + 9;
    
    /**
     * =============================== 
     *  设置支付密码 验证登录密码 协议 code:chekLognPwd cmdID= ID0144
     * =================================
     */

    public static final int CHEKLOGNPWD_BASE = 101440;
    /**
     * 验证通过
     */
    public static final int CHEKLOGNPWD_SUCCESS = CHEKLOGNPWD_BASE + 1;
    /**
     * 密码验证未通过
     */
    public static final int CHEKLOGNPWD_PWDERROR = CHEKLOGNPWD_BASE + 2;
    
    /**
     * 系统异常
     */
    public static final int CHEKLOGNPWD_ERROR = CHEKLOGNPWD_BASE + 9;
    
    /**
     * =============================== 
     *  设置支付密码 协议 code:veriPassword cmdID= ID0130
     * =================================
     */

    public static final int VERIPASSWORD_BASE = 101300;
    /**
     * 设置支付密码成功
     */
    public static final int VERIPASSWORD_SUCCESS = VERIPASSWORD_BASE + 1;
    /**
     * 支付密码不符合要求
     */
    public static final int VERIPASSWORD_PWDERROR = VERIPASSWORD_BASE + 2;
    
    /**
     * 系统异常
     */
    public static final int VERIPASSWORD_ERROR = VERIPASSWORD_BASE + 9;
    
    
    /**
     * =============================== 
     *  获取订单客户端列表  协议 code: cmdID= ID0110
     * =================================
     */

    public static final int GETORDERLIST_BASE = 101100;
    /**
     * 查询成功
     */
    public static final int GETORDERLIST_SUCCESS = GETORDERLIST_BASE + 1;
    /**
     * 订单类型无效
     */
    public static final int GETORDERLIST_ORDERTYPE_ERROR = GETORDERLIST_BASE + 2;
    
    /**
     * 系统异常
     */
    public static final int GETORDERLIST_ERROR = GETORDERLIST_BASE + 9;
    
    
    
    /**
     * =============================== 
     *  查询订单详情信息 协议 code:getOrderDetail cmdID= ID0111
     * =================================
     */

    public static final int GETORDERDETAIL_BASE = 101110;
    /**
     * 查询成功
     */
    public static final int GETORDERDETAIL_SUCCESS = GETORDERDETAIL_BASE + 1;
    /**
     * 订单详情没有查询到
     */
    public static final int GETORDERDETAIL_NOTFIND = GETORDERDETAIL_BASE + 2;
    
    /**
     *系统异常
     */
    public static final int GETORDERDETAIL_ERROR = GETORDERDETAIL_BASE + 9;
    
    
    /**
     * =============================== 
     *  查询订单售后详情 协议 code:queryCustomerServiceInfoSP cmdID= ID0062
     * =================================
     */

    public static final int AFTERSERVICE_SP_BASE = 10620;
    /**
     * 查询成功
     */
    public static final int AFTERSERVICE_SP_SUCCESS = AFTERSERVICE_SP_BASE + 1;
    /**
     * 售后单详情没有查询到
     */
    public static final int AFTERSERVICE_SP_NOTFIND = AFTERSERVICE_SP_BASE + 2;
    
    /**
     *系统异常
     */
    public static final int AFTERSERVICE_SP_ERROR = AFTERSERVICE_SP_BASE + 9;
    
    /**
     * =============================== 
     *  客户端 查询订单售后列表 协议 code:getAfterServiceClientList cmdID= ID0105
     * =================================
     */

    public static final int GETAFTERSERVICECLIENTLIST_BASE = 11500;
    /**
     * 查询成功
     */
    public static final int GETAFTERSERVICECLIENTLIST_SUCCESS = GETAFTERSERVICECLIENTLIST_BASE + 1;

    /**
     *系统异常
     */
    public static final int GETAFTERSERVICECLIENTLIST_ERROR = GETAFTERSERVICECLIENTLIST_BASE + 9;
    
    /**
     * =============================== 
     *  客户端 查询工长详情 协议 code:queryForemanfo cmdID= ID0124
     * =================================
     */

    public static final int QUERYFOREMANFO_BASE = 112400;
    /**
     * 查询成功
     */
    public static final int QUERYFOREMANFO_SUCCESS = QUERYFOREMANFO_BASE + 1;

    /**
     *系统异常
     */
    public static final int QUERYFOREMANFO_ERROR = QUERYFOREMANFO_BASE + 9;
    
    
    /**
     * =============================== 
     *  客户端 查询装修动态  协议 code:getDynamiction cmdID= ID0100
     * =================================
     */

    public static final int GETDYNAMICTION_BASE = 101000;
    /**
     * 查询成功
     */
    public static final int GETDYNAMICTION_SUCCESS = GETDYNAMICTION_BASE + 1;

    /**
     *系统异常
     */
    public static final int GETDYNAMICTION_ERROR = GETDYNAMICTION_BASE + 9;
    
    /**
     * =============================== 
     *  客户端 查询售后详情  协议 code:QueryAfterServiceInfoClient cmdID= ID0147
     * =================================
     */

    public static final int QUERYAFTERSERVICEINFOCLIENT_BASE = 101470;
    /**
     * 查询成功
     */
    public static final int QUERYAFTERSERVICEINFOCLIENT_SUCCESS = QUERYAFTERSERVICEINFOCLIENT_BASE + 1;

    /**
     *系统异常
     */
    public static final int QUERYAFTERSERVICEINFOCLIENT_ERROR = QUERYAFTERSERVICEINFOCLIENT_BASE + 9;
    
    
}
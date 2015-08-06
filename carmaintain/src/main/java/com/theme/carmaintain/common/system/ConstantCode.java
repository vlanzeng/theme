/**
 * All rights owned by Niehui Technology
 * File name : com.qttecx.idas.system.ConstantCode.java
 */
package com.theme.carmaintain.common.system;

/**
 * <p>
 * Title: ConstantCode.java
 * </p>
 * <p>
 * Description:常量码定义
 * </p>
 * <p>
 * </p>
 * <p>
 * </p>
 * <p>
 * CreateTime:2014年7月2日 上午10:06:11
 * </p>
 * 
 * @author Administrator
 * @version 1.0
 **/
public class ConstantCode {
	// rescode常量字段
	public static final String RESCODE = "resCode";
	/**
	 * 效果图缩略图所存放的路径<br>
	 * 请保持和boos系统的的缩略图存放的路径保持一致
	 */
	public static final String UPLOAD_RENDERIN_THUMBNAIL = "/upload/rendering/thumbnail";

	/**
	 * 数据服务器部署的路径 eg:boss的部署路径 D:/apache-tomcat-6.0.29/webapps/boss
	 */
	public static final String SERVER_DEPLOY_PATH = "D:/apache-tomcat-6.0.29/webapps/boss";

	/**
	 * 成都行政编码
	 */
	public static final String CITY_CODE_CHENGDU = "510100";

	/**
	 * 角色类型--设计师类型1
	 */
	public static final int JOBSCOPE_DESIGNER_TYPE = 1;
	/**
	 * 角色类型--商家类型2
	 */
	public static final int JOBSCOPE_BUSINESS_TYPE = 2;
	/**
	 * 角色类型--小工类型3
	 */
	public static final int JOBSCOPE_WORKER_TYPE = 3;
	/**
	 * 角色类型--工长类型4
	 */
	public static final int JOBSCOPE_FOREMAN_TYPE = 4;
	/**
	 * 角色类型 点赞 收藏加一使用 --原图5
	 */
	public static final int RENDERING_TYPE = 5;
	 /**
     * 角色类型--监理类型6
     */
   public static final int  SUPERVISOR_TYPE   = 6;
   
   /**
    * 角色类型--用户类型7
    */
  public static final int  USER_TYPE   = 7;
  
  /**
   * 角色类型--运维类型8
   */
 public static final int  BOSS_USER_TYPE   = 8;
   
   //工长，设计师，小工在角色表中的id值  role：  2, '小工'。 3, '设计师。4, '商家',5'工长' 6'监理'
   //1 是系统管理员
   public static final int  ROKE_WORKER_TYPE=2;
   public static final int  ROKE_DESIGNER_TYPE=3;
   public static final int  ROKE_BUSINESS_TYPE=4;
   public static final int  ROKE_FOREMAN_TYPE=5;
   public static final int  ROKE_SUPERVISOR_TYPE=6;
   
   /**
    * 状态id
    * stateId
    */
   public static final String STATE_ID = "stateId";
   /**
    * 状态名
    * stateName
    */
   public static final String STATE_NAME = "stateName";
}

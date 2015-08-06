package com.theme.carmaintain.common.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class ConfigContentUtils {
	/**
	 * 获取静态文件根目录
	 */
	public static final String STATIC_PIC_ROOT_PATH = getString("storageUrl");
	/**
	 * 网站上传图片的总文件夹名称
	 */
	public static final String UPLOAD_IMAGE_PATH = getString("projectName");
	/**
	 * 图片域名地址,图片展示就用
	 * return LocalConfigUtils.STATIC_PICUPLOAD_DOMAIN + 图片相对位置;
	 */
	public static final String STATIC_PICUPLOAD_DOMAIN = getString("accessUrl");
	
	/**
	 * 通过第三方：如友盟推送消息的发送模式：
	 * true为产品模式；false为测试模式.
	 */
	public static final String PUSH_PRODUCTION_MODE = getString("push_production_mode");
    /**
     * 推送消息--苹果的appkey
     */
	public static final String PUSH_APPKEY_APPLE = getString("push_appkey_apple");
	public static final String PUSH_APPKEY_SP_APPLE = getString("push_appkey_sp_apple");
    /**
     * 推送消息--苹果的appmaster
     */
	public static final String PUSH_APPMASTERSECRET_APPLE = getString("push_appmastersecret_apple");
	public static final String PUSH_APPMASTERSECRET_SP_APPLE = getString("push_appmastersecret_sp_apple");
    /**
     * 推送消息--android的appmaster
     */
	public static final String PUSH_APPMASTERSECRET_ANDROID = getString("push_appmastersecret_android");
	public static final String PUSH_APPMASTERSECRET_SP_ANDROID = getString("push_appmastersecret_sp_android");
    /**
     * 推送消息--android的appkey
     */
	public static final String PUSH_APPKEY_ANDROID = getString("push_appkey_android");
	public static final String PUSH_APPKEY_SP_ANDROID = getString("push_appkey_sp_android");
	/**
	 * wap的访问域名及相对路径
	 */
	public static final String WAP_DOMAIN_URL = getString("wap_domain_url");
	   /**
     * 通过第三方：如友盟推送消息的发送模式：
     * true为产品模式；false为测试模式.
     */
	public static boolean getPushProductionMode(){
	    return Boolean.valueOf(PUSH_PRODUCTION_MODE);
	}
	
	/**
	 * 网站的绝对路径
	 */
	public static final String WEB_ROOT = getWebRoot();
	public static String getStorageUrl(){
	    return STATIC_PIC_ROOT_PATH.replace("/", File.separator);
	}
	public static String getProjectName(){
	    return UPLOAD_IMAGE_PATH.replace("/", File.separator);
	}
	/**
	 * 获取图片的前缀地址
	 * 
	 * @return
	 */
	public static String getPicContentUri() {
		return STATIC_PICUPLOAD_DOMAIN + UPLOAD_IMAGE_PATH;
	}
	/**
	 * 获取图片的磁盘地址
	 * @return
	 */
	public static String getDiskPicPath(){
		return STATIC_PIC_ROOT_PATH + UPLOAD_IMAGE_PATH;
	}

	public static void main(String[] args) throws IOException {
	        System.out.println(ConfigContentUtils.getString("storageUrl")); 
	}
	
	public static String getString(String propsvalue){
		Properties props;
		try {
			props = PropertiesLoaderUtils.loadAllProperties("projectUrl.properties");
		} catch (IOException e) {
			return "";
		} 
		return props.getProperty(propsvalue);
	}
	
	private static final String getWebRoot() {
		URL url = ConfigContentUtils.class.getResource("/");
		String path = url.getPath();
		if (path.endsWith("/WEB-INF/classes/")) {
			int beginIndex = path.length() - "WEB-INF/classes/".length();
			return path.substring(0, beginIndex);
		}
		return path;
	}

}
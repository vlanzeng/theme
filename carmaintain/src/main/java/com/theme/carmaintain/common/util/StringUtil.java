package com.theme.carmaintain.common.util;

import java.io.File;
import org.apache.commons.lang3.StringUtils;

public class StringUtil {
	 
	/**
	 * @Description 首字母小写
	 */
	public static String firstLower(String str) {
        if (trimIsEmpty(str))
            return "";
        StringBuffer resultBuffer = new StringBuffer();
        resultBuffer.append(str.substring(0, 1).toLowerCase());
   	    resultBuffer.append(str.substring(1));
        String result = resultBuffer.toString();
        return result;
    }
	
	/**
	 * @Description 首字母大写
	 */
	public static String firstUpper(String str) {
        if (trimIsEmpty(str))
            return "";
        StringBuffer resultBuffer = new StringBuffer();
        resultBuffer.append(str.substring(0, 1).toUpperCase());
   	    resultBuffer.append(str.substring(1));
        String result = resultBuffer.toString();
        return result;
    }
	 
	 /**
		 * @Description 判断去掉空格后是否为空字符串
		 */
	 public static boolean trimIsEmpty(String str){
	 	 if(str==null){
			 return true;
		 }
		 String newStr = str.trim();
		 return isEmpty(newStr);
	 } 
	 
	 /**
	 * @Description 判断是否为空字符串
	 */
	public static boolean isEmpty(String str){
		 if(str==null||str.length()==0){
			 return true;
		 }
		 return false;
	 } 
	
	/**
	 * @Description state true 返回带.jsp的名字 否则返回去掉.jsp的名字
	 */
	public static String getJspName(String name,boolean state) {
		if(isEmpty(name)) {
			return name;
		} 
		if(state) {
			if(name.indexOf(".jsp") != -1) {
				return name;
			} else {
				return name + ".jsp";
			}
		} else {
			if(name.indexOf(".jsp") != -1) {
				return name.substring(0,name.indexOf(".jsp"));
			} else {
				return name;
			}
		}
	}
    /**
     * 构造图片访问路径
     * @param path
     * @return
     */
    public static String buildingPicShowURL(String path){
    	if(!StringUtils.isBlank(path)){
    		if(path.contains("http://")){
	    		return buildingURL(path);
	    	}else{
	    		return buildingURL(ConfigContentUtils.STATIC_PICUPLOAD_DOMAIN + path);
	    	}
    	}else{
    		return "";
    	}
	    	
        
    }
    /**构造URL格式*/
    public static String buildingURL(String original){
        return original.replace(File.separator, "/");
    }
}
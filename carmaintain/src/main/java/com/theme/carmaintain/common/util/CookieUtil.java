package com.theme.carmaintain.common.util;

import java.util.Map;
import java.util.HashMap;
import java.net.URLEncoder;
import javax.servlet.http.Cookie;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {
    /**
     * 设置cookie
     * @param response
     * @param name  cookie名字
     * @param value cookie值
     * @param maxAge cookie生命周期  以秒为单位
     * @throws UnsupportedEncodingException 
     */
     public static void addCookie(HttpServletResponse response,String name,String value,int maxAge) throws UnsupportedEncodingException{
       Cookie cookie = new Cookie(name,URLEncoder.encode(value, "UTF-8"));
       cookie.setPath("/");
       if(maxAge>0){  
         cookie.setMaxAge(maxAge);
       }
       response.addCookie(cookie);
       }
     
     /**
     * 根据名字获取cookie（接口方法）
     * @param request
     * @param name cookie名字
     * @return
     */
     public static Cookie getCookieByName(HttpServletRequest request,String name){
       Map<String,Cookie> cookieMap = ReadCookieMap(request);
       if(cookieMap.containsKey(name)){
         Cookie cookie = (Cookie)cookieMap.get(name);
         return cookie;
       }else{
         return null;
       } 
       }
     
     /**
     * 将cookie封装到Map里面（非接口方法）
     * @param request
     * @return
     */
     private static Map<String,Cookie> ReadCookieMap(HttpServletRequest request){ 
     Map<String,Cookie> cookieMap = new HashMap<String,Cookie>();
     Cookie[] cookies = request.getCookies();
     if(null!=cookies){
       for(Cookie cookie : cookies){
        cookieMap.put(cookie.getName(), cookie);
       }
     }
     return cookieMap;
     }
}

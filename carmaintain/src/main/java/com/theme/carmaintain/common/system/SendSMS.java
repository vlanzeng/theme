package com.theme.carmaintain.common.system;

import java.net.URL;
import java.util.Map;
import java.net.URLEncoder;
import java.io.IOException;
import java.io.BufferedReader;
import org.apache.log4j.Logger;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import com.theme.carmaintain.common.util.ReaderProperties;


/**
 * 文件名称：sendSMS_demo.java
 * 文件作用：美联软通 http接口使用实例
 * 创建时间：2012-05-18
 * 返回值 说明
 * success:msgid 提交成功，发送状态请见4.1
 * error:msgid 提交失败
 * error:Missing username 用户名为空
 * error:Missing password 密码为空
 * error:Missing apikey APIKEY为空
 * error:Missing recipient 手机号码为空
 * error:Missing message content 短信内容为空
 * error:Account is blocked 帐号被禁用
 * error:Unrecognized encoding 编码未能识别
 * error:APIKEY or password error APIKEY 或密码错误
 * error:Unauthorized IP address 未授权 IP 地址
 * error:Account balance is insufficient 余额不足
 * error:Black keywords is:党中央 屏蔽词
 */
@SuppressWarnings("rawtypes")
public class SendSMS {
    private static  Logger logger = Logger.getLogger(SendSMS.class);
    /***
    public static void main(String[] args) throws IOException {
        sendSMS("【臬辉科技】欢迎使用装修神器应用，您的短信验证码为456789,请勿向任何人泄漏您的短信验证码。", "15982184382");
    }
    **/
    public static String sendSMS(String smsContent, String mobile) throws IOException {
        // 发送内容
        StringBuffer content = new StringBuffer();
        content.append("欢迎使用屋托邦应用，您的短信验证码为:").append(smsContent).append("，请勿向任何人泄漏您的短信验证码。【臬辉科技】");
       
        Map map = ReaderProperties.readData("sms.properties");
        
       //创建StringBuffer对象用来操作字符串 http://m.5c.com.cn/api/send/?
        
        StringBuffer sb = new StringBuffer();
        //请求地址
        sb.append(map.get("requestUrl")).append("/api/send/?");
        // APIKEY
        sb.append("apikey="+map.get("apikey"));

        // 用户名
        sb.append("&username="+map.get("username"));

        // 向StringBuffer追加密码
        sb.append("&password="+map.get("password"));

        // 向StringBuffer追加手机号码
        sb.append("&mobile=" + mobile);  

        // 向StringBuffer追加消息内容转URL标准码
        sb.append("&content=" + URLEncoder.encode(content.toString(),"GBK"));
        logger.debug("请求路径："+sb.toString());
        // 创建url对象
        URL url = new URL(sb.toString());

        // 打开url连接
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // 设置url请求方式 ‘get’ 或者 ‘post’
        connection.setRequestMethod("POST");

        // 发送
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        // 返回发送结果
        String inputline = in.readLine();

        // 输出结果
        System.out.println(inputline);
        return inputline;
    }
    /**
     * 发送自定义消息
     * @param smsContent消息内容
     * @param mobile移动电话
     * @return
     * @throws IOException
     */
	public static String sendSMSNormalContent(String smsContent, String mobile) throws IOException {
        // 发送内容
        StringBuffer content = new StringBuffer();
        content.append(smsContent);
        Map map = ReaderProperties.readData("sms.properties");
       //创建StringBuffer对象用来操作字符串 http://m.5c.com.cn/api/send/?
        StringBuffer sb = new StringBuffer();
        //请求地址
        sb.append(map.get("requestUrl")).append("/api/send/?");
        // APIKEY
        sb.append("apikey="+map.get("apikey"));
        // 用户名
        sb.append("&username="+map.get("username"));
        // 向StringBuffer追加密码
        sb.append("&password="+map.get("password"));
        // 向StringBuffer追加手机号码
        sb.append("&mobile=" + mobile);  
        // 向StringBuffer追加消息内容转URL标准码
        sb.append("&content=" + URLEncoder.encode(content.toString(),"GBK"));
        logger.debug("请求路径："+sb.toString());
        // 创建url对象
        URL url = new URL(sb.toString());
        // 打开url连接
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        // 设置url请求方式 ‘get’ 或者 ‘post’
        connection.setRequestMethod("POST");
        // 发送
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        // 返回发送结果
        String inputline = in.readLine();
        // 输出结果
        System.out.println(inputline);
        return inputline;
    }
}
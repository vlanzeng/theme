package com.theme.carmaintain.common.system;

import java.sql.Blob;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Random;
import java.util.Calendar;
import java.util.ArrayList;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.ParseException;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import org.apache.commons.lang3.StringUtils;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import com.theme.carmaintain.common.util.ReaderProperties;


public class Commons {
    private Commons() {

    }

    /**
     * 获取系统的当前时间
     * dateFormat 时间格式
     * @return
     */
    public static String getNowTime(String dateFormat) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        Date date = new Date();
        String nowTime = simpleDateFormat.format(date);
        return nowTime;
    }

    /***
     * 判断参数是否全是整数数字(非数字，小数均无法通过)
     * @param str
     *        字符串
     * @return 数字字符串返回true.否则返回false
     */
    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher matcher = pattern.matcher(str);
        boolean b = matcher.matches();
        return b;
    }

    // 判断是否为数字或数字字符串
    public static boolean isNum(String str) {
        return str.matches("\\d+");
    }

    /***
     * @function：字符串转为数字。
     * @param ：字符串
     * @return ：int
     * @describe：如果转换成功，返回一个整型的数字；如果转换失败，返回-1.
     */
    public static int stringToInt(String parameter) {
        int i = -1;
        try {
            if ( parameter != null && !"".equals(parameter) ) {
                boolean b = Commons.isNumeric(parameter);
                if ( b ) {
                    i = Integer.parseInt(parameter);
                }
            }
        }
        catch (Exception e) {
            // 转换出现异常 比如输入的数据超出int范围
            i = -1;
        }
        return i;
    }

    /***
     * @function：字符串转为数字。
     * @param ：字符串
     * @return ：int
     * @describe：如果转换成功，返回一个整型的数字；如果转换失败，返回-1.
     */
    public static long stringToLong(String parameter) { 
        long i = -1L;
        if ( parameter != null && !"".equals(parameter) ) {
            boolean b = Commons.isNumeric(parameter);
            if ( b ) {
                i = Integer.parseInt(parameter);
            }
        }
        return i;
    }

    /***
     * 是否为空字符串
     * @param str
     * @return
     */
    public static String isNull(String str) {
        String s = str.replaceAll("\\s", "");
        return s;
    }

    /**
     * 随机获取UUID字符串(无中划线)
     * @return UUID字符串
     */
    public static String getUUID() {
        String uuid = UUID.randomUUID().toString();
        return uuid.substring(0, 8) + uuid.substring(9, 13) + uuid.substring(14, 18) + uuid.substring(19, 23)
                + uuid.substring(24);
    }
   

    /**
     * 随机获取字符串
     * @param length
     *        随机字符串长度
     * @return 随机字符串
     */
    public static String getRandomString(int length) {
        if ( length <= 0 ) {
            return "";
        }
        char[] randomChar = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            stringBuffer.append(randomChar[Math.abs(random.nextInt()) % randomChar.length]);
        }
        return stringBuffer.toString();
    }

    /**
     * 根据指定长度 分隔字符串
     * @param str
     *        需要处理的字符串
     * @param length
     *        分隔长度
     * @return 字符串集合
     */
    public static List<String> splitString(String str, int length) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < str.length(); i += length) {
            int endIndex = i + length;
            if ( endIndex <= str.length() ) {
                list.add(str.substring(i, i + length));
            }
            else {
                list.add(str.substring(i, str.length() - 1));
            }
        }
        return list;
    }

    /**
     * 将字符串List转化为字符串，以分隔符间隔.
     * @param list
     *        需要处理的List.
     * @param separator
     *        分隔符.
     * @return 转化后的字符串
     */
    public static String toString(List<String> list, String separator) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : list) {
            stringBuffer.append(separator + str);
        }
        stringBuffer.deleteCharAt(0);
        return stringBuffer.toString();
    }

    // 编码转换
    public static String Bytes(String str) {
        try {
            str = new String(str.getBytes("ISO-8859-1"), "utf-8");
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * 文件编码转换
     * @param downloadFileName 要转换的字符串
     * @return
     */
    public static String getFileEcodingName(String downloadFileName) {
        try {
            downloadFileName = new String(downloadFileName.getBytes(), "ISO-8859-1");
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return downloadFileName;
    }

    public static String URLencode(String str) {
        try {
            str = URLEncoder.encode(str, "utf-8");
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return str;
    }

    public static String URLdecode(String str) {
        try {
            str = URLDecoder.decode(str, "utf-8");
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * 获取项目的根目录
     * eg:D:\apache-tomcat-6.0.29\webapps\gycenter\
     * @param request
     * @return patch
     */
    public static String getProjectPatch(HttpServletRequest request) {
        String realPath = request.getSession().getServletContext().getRealPath("/");
        return realPath;
    }

    /***
     * 校验邮箱是否合法
     * @param email
     * @return
     */
    public static boolean isEmail(String email) {
        String str = "^([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)*@([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)+[\\.][A-Za-z]{2,3}([\\.][A-Za-z]{2})?$";
        Pattern p = Pattern.compile(str);
        Matcher m = p.matcher(email);
        return m.matches();
    }

    /***
     * 字符串过滤<br>
     * 过滤掉字符串中的<,>,符号。<br>
     * 将其转为& lt "& gt"符号
     * @param s 要过滤的字符串
     * @return 过滤后的String
     */
    public static String strFiltration(String s) {
        s = s.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
        System.out.println("过滤后" + s);
        return s;
    }

    /**
     * 字符串转为日期
     * yyyy-MM-dd
     * @param sDate
     * @return
     */
    public static Date String2Date(String sDate) {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sf.parse(sDate);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    
    /***
     * 字符串转为日期
     * @author Administrator
     * @creaetime 2014年10月23日 下午5:16:24
     * @param sDate字符串类型的日期
     * @param fomat 格式化 如yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static Date String2Date(String sDate,String fomat) {
        SimpleDateFormat sf = new SimpleDateFormat(fomat);
        Date date = null;
        try {
            date = sf.parse(sDate);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 日期转为字符串
     * yyyy-MM-dd
     * @param sDate
     * @return
     */
    public static String date2String(Date date, String fomat) {
        SimpleDateFormat sf = new SimpleDateFormat(fomat);
        if ( null != date ) {
            String sDate = sf.format(date);
            return sDate;
        }
        return null;
    }

    /***
     * 获取当前日期前(后)n天
     * @param nowDate 当前日期
     * @param day 要向前或者向后的天数
     *        -n表示当前日期的前n天
     *        n表示当前日期的后n天
     * @return
     */

    @SuppressWarnings("static-access")
	public static Date getBeforeOrBackFromNowDate(Date nowDate, int day) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(nowDate);
        calendar.add(calendar.DATE, day);
        return calendar.getTime();
    }
    
    /***
     * 校验手机号码是否正确
     * (正则根据业务不同而有所不同。这里特别支持170 177字段)
     * @author Administrator
     * @creaetime 2014年5月4日 下午2:19:42
     * @return 正确：true；错误:false
     */
    public static boolean chekPhoneNumber(String phoneNumber ){
        String str = "^((13[0-9])|(15[0-3,5-9])|(18[0-9])|(170)|(177))\\d{8}$";
        Pattern p = Pattern.compile(str);
        Matcher m = p.matcher(phoneNumber);
        return m.matches();
    }

    /***
     * bolob转为byte
     * @param blob
     * @return
     * @throws Exception
     */
    public static byte[] blob2ByteArr(Blob blob){

        byte[] b = null;
        try {
            if (blob != null) {
                long in = 0;
                b = blob.getBytes(in, (int) (blob.length()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return b;
    }
    
    
    /**
     * 转换连接，将“\” 转为“/”
     * @param  filePath 图片的相对路径或者全路径
     * @param  domainUrl 访问图片的域名
     * @return 图片完整访问路径 或者""
     */
    public static String   replacePath(String domainUrl, String filePath){
        String url = "";
        if(!StringUtils.isBlank(domainUrl) && !StringUtils.isBlank(filePath)){
            if(filePath.contains("http://")){
                //如果是全路径就不再拼接
                url = filePath.replace("\\", "/");
            }else{
                //如果是相对路径 就拼接
                url =  domainUrl+ filePath;
                // url = url.replaceAll("\\\\", "/");  == url = url.replace("\\", "/");
                url = url.replace("\\", "/");
                System.out.println(url);
            }
        }
        return url;
    }
    
    /**
     * 转换连接，将“\” 转为“/”<br>
     * 内部定义的参数名称：projectUrl.properties :文件访问的路径properties文件
     * accessUrl ：文件访问的路径如： http://192.168.3.118
     * @param  filePath 图片的相对路径或者全路径
     * @return 图片完整访问路径 或者""
     */
    public static String  replacePath( String filePath){
        String url = "";
        @SuppressWarnings("rawtypes")
		Map map =  ReaderProperties.readData("projectUrl.properties");
        if(!StringUtils.isBlank(filePath)){
            if(filePath.contains("http://")){
                //如果是全路径就不再拼接
                url = filePath.replace("\\", "/");
                System.out.println("图片是全路径"+url);
            }else{
                //如果是相对路径 就拼接
                url =  map.get("accessUrl")+ filePath;
                // url = url.replaceAll("\\\\", "/");  == url = url.replace("\\", "/");
                url = url.replace("\\", "/");
                System.out.println(url);
            }
        }
        return url;
    }
    
    
    /**
     * null对象  String Character转为""<br>
     * @param String
     * @return String
     */
    public static String null2EmptyString(String param){
            if(null == param){
                param = ""; 
            } 
        return param;
    } 
    
    /**
     * null对象 Number转为0<br>
     * @param Number
     * @return Number
     */
    public static Number nullNumber2Zero(Number param){
            if(null == param){
                param = 0; 
            } 
        return param;
    } 

    public static boolean   IsEmptyObj(Object obj){
    	boolean result=false;
    	if(null==obj){
    		result= true;
    	}else if(obj.toString().trim().isEmpty()){
    		result= true;
    	}
    	return result;
    }
    
    @SuppressWarnings("rawtypes")
	public static boolean   IsEmptyList(List list){
    	boolean result=false;
    	if(null==list){
    		result= true;
    	}else if(list.size()==0){
    		result= true;
    	}
    	return result;
    }
    
    /**
     * main方法
     * @param args
     */
	@SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
       //System.out.println(replacePath(ConfigContentUtils.STATIC_PICUPLOAD_DOMAIN, "staticResource\booking\20150126\1422258538979.jpg")); 
//       String s = new String("java");
//       StringBuffer  buffer = new StringBuffer("java");
//       System.out.println(s+buffer);
    
		List list=new ArrayList();
    	list.add(1);
        System.out.println(IsEmptyList(list));
    }
      
}

/**
* All rights owned by Niehui Technology
* File name :com.qttec.checkversion.util.ReaderProperties.java
*/
package com.theme.carmaintain.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import org.apache.log4j.Logger;

/***
 * <p>
 * Title: ReaderProperties.java
 * </p>
 * <p>
 * Description:读取properties文件。将数据组装为Map
 * </p>
 * <p>
 * </p>
 * <p>
 * </p>
 * <p>
 * </p>
 * @author Administrator
 * @version 1.0
 */
public class ReaderProperties {
    private static Logger logger = Logger.getLogger(ReaderProperties.class);

    /**
     * 读取properties文件 将数据封装到Map中
     * @author Administrator
     * @creaetime 01-04-2014 13:54:04
     * @param propertie 需要读取的配置文件
     * @return
     */
    public static Map<String, String> readData(String  propertie) {
        Map<String, String> map = new HashMap<String, String>();
        InputStream inputStream = null;
        try {
            inputStream = ReaderProperties.class.getClassLoader().getResourceAsStream(propertie);
            Properties properties = new Properties();
            properties.load(inputStream);
            Set<Entry<Object, Object>> set = properties.entrySet();
            // 迭代
            Iterator<Map.Entry<Object, Object>> iterator = set.iterator();
            while (iterator.hasNext()) {
                Entry<Object, Object> entry = iterator.next();
                map.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
            }
        }catch (Exception e) {
            logger.error(propertie+"没有找到");
        }finally{
            if(inputStream != null){
                try {
                    inputStream.close();
                }
                catch (IOException e) {
                    logger.error("关闭输入流的时候出现异常"+e.getMessage());
                }
            }
        }
        return map;
    }
    /**
     * 文件名称相对在classpath路径
     * @param filename
     * @return
     */
    public static Properties read(String filename) {
        Properties p = new Properties();
        try {
            InputStream in = ReaderProperties.class.getClassLoader().getResourceAsStream(filename);
            p.load(in);
            p.list(System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }
    
}

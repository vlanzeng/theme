package com.theme.carmaintain.common.util;

import java.util.Map;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.JsonGenerationException;

public class JsonUtil {
    private static ObjectMapper objectmapper = new ObjectMapper();
    /**
     * json转map
     * @author lxx
     * @creaetime 2014年3月28日 下午1:37:46
     * @param json
     * @return
     * @throws IOException
     * @throws JsonMappingException
     * @throws JsonParseException
     */
    @SuppressWarnings("rawtypes")
    public static Map readJsonToMap(String json) throws IOException {
        return objectmapper.readValue(json, Map.class);
    }

    /**
     * map 转 json
     * @author lxx
     * @creaetime 2014年4月3日 下午3:56:40
     * @param map
     * @return json
     * @throws JsonGenerationException
     * @throws JsonMappingException
     * @throws IOException
     */
    @SuppressWarnings("rawtypes")
	public static String readMaptoJson(Map map) throws IOException {
        return objectmapper.writeValueAsString(map);
    }
    @SuppressWarnings("unchecked")
    public static List<LinkedHashMap<String, Object>> readJsontoList(String json) throws IOException{
        return objectmapper.readValue(json, List.class);
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> List readJsonToListBean(Class<?> beanclass,String json) throws IOException{
        JavaType javaType  = getCollectionType(ArrayList.class, beanclass);  
        List<T> lst =  (List<T>)objectmapper.readValue(json, javaType); 
        return lst;
    }

    private static JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
        return objectmapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);  
    }
    
}


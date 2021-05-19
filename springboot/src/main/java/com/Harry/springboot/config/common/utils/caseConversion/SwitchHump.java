package com.Harry.springboot.config.common.utils.caseConversion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Descirption 转换驼峰式命名
 * @Author Harry
 * 2020年 05月 29日
 */
public class SwitchHump {

    private static Pattern linePattern = Pattern.compile("_(\\w)");

    /**
      * @Description: 将map的Key大写转换成小写
      * @Date:  
      * @Author: Harry
      * @Param: 
      * @return: 
      */ 
    public static List<Map<String, Object>> upperCaseToLowerCase(List<Map<String, Object>> list) {

        List<Map<String, Object>> objects = new ArrayList<>();
        try {
            for (Map<String, Object> map : list) {
                Map<String, Object> stringObjectHashMap = new HashMap<>();
                for (String oldKey : map.keySet()) {
                    //key是旧的key值
                    String newKey = oldKey.toLowerCase();
                    //调用lineToHump方法，将下划线转成驼峰式
                    String s = lineToHump(newKey);
                    stringObjectHashMap.put(s, map.get(oldKey));
                }
                objects.add(stringObjectHashMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objects;
    }

    /**
      * @Description: 下划线转驼峰
      * @Date:  
      * @Author: Harry
      * @Param: 
      * @return: 
      */ 
    public static String lineToHump(String str) {
        str = str.toLowerCase();
        Matcher matcher = linePattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
}

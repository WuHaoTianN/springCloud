package com.Harry.springboot.config.common.utils.bean;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ClassName CommonUtils
 * @Description TODO
 * @Author 吴昊天
 * @Date 2021/7/15 11:23
 * @Version 1.0
 **/
public class CommonUtils {

    public static Object copy(Object object,Object newObject) throws Exception{
        Class<?> classType = object.getClass();
        Class<?> newClassType = newObject.getClass();
        newClassType.getConstructor(new Class[] {}).newInstance(new Object[] {});
        //获得对象的所有成员变量
        Field[] fields = classType.getDeclaredFields();
        Field[] newFields = newClassType.getDeclaredFields();

        for (Field field : fields){
            //获取成员变量的名字
            String name = field.getName();
            //获得属性类型
            Class<?> fieldType = field.getType();
            // 去除Serializable序列
            if (name.equalsIgnoreCase("serialVersionUID")){
                continue;
            }
            for (Field nField : newFields){
                String newName = nField.getName();
                Class<?> newFieldType = nField.getType();
                if (newName.equalsIgnoreCase("serialVersionUID")){
                    continue;
                }
                if (newName.equals(name) && newFieldType.equals(fieldType)){
                    //获取get方法的名字
                    //将属性的首字母转换为大写
                    String firstLetter = name.substring(0,1).toUpperCase();
                    String getMethodName = "get" + firstLetter + name.substring(1);
                    //获取方法对象
                    Method getMethod = classType.getMethod(getMethodName, new Class[]{});
                    //调用get方法获取旧的对象的值
                    Object value = getMethod.invoke(object, new Object[]{});
                    //获取set方法的名字
                    String newFirstLetter = newName.substring(0, 1).toUpperCase();
                    String setMethodName = "set" + newFirstLetter + newName.substring(1);
                    //注意set方法需要传入参数类型
                    Method setMethod = newClassType.getMethod(setMethodName, new Class[]{newFieldType});
                    //调用set方法将这个值复制到新的对象中去
                    setMethod.invoke(newObject,new Object []{});
                }
            }
        }
        return  newObject;
    }
}

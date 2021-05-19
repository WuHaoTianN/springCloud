package com.Harry.springboot.config.common.utils.md5;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * @ClassName Md5Util
 * @Description TODO
 * @Author 吴昊天
 * @Date 2021/4/26 11:24
 * @Version 1.0
 **/
public class Md5Util{

    /**
     * @Author 吴昊天
     * @Description 定义一个md5加密的方法
     * @Date 11:28 2021/4/26
     * @param planinText
     * @return
     **/
    public static String md5(String planinText){
        // 定义一个字节数组
        byte[] secretBytes = null;
        try{
            // 生成一个MD5加密计算摘要
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            //对字符串进行加密
            messageDigest.update(planinText.getBytes());
            //获得加密后的数据
            secretBytes = messageDigest.digest();
        }catch (Exception e){
            throw new RuntimeException("对不起，没有这个md5算法");
        }
        //将加密后的数据转换为16进制数字
        String md5code = new BigInteger(1,secretBytes).toString(16);
        // 如果生成数字未满32位，需要前面补0
        for (int i = 0; i < 32 - md5code.length(); i++ ){
            md5code = "0" + md5code;
        }
        return md5code;
    }

}

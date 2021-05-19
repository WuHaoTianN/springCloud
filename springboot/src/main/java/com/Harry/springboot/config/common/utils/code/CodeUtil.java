package com.Harry.springboot.config.common.utils.code;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.SimpleFormatter;

/**
 * @ClassName CodeUtil
 * @Description TODO
 * @Author 吴昊天
 * @Date 2021/4/17 15:42
 * @Version 1.0
 **/
public class CodeUtil {

    /**
     * 使用到Algerian字体，系统里没有的话需要安装字体，字体只显示大写，去掉了1,0,i,o几个容易混淆的字符
     */
    public static final String VERIFY_CODES ="1234567890";

    /**
     * @Author 吴昊天 
     * @Description 使用系统默认字符源生成验证码
     * @Date 15:44 2021/4/17
     * @Param verifySize 验证码长度
     * @return 
     **/
    public static String generateVerifyCode(Integer verifySize){
        return null;
    }

    /**
     * @Author 吴昊天 
     * @Description 使用指定源生成验证码
     * @Date 0:05 2021/4/18
     * @Param verifySize 验证码长度
     * @param sources 验证码字符源
     * @return 
     **/
    public static String generateVerifyCode(int verifySize,String sources){
        if (sources == null || sources.length() == 0){
            sources = VERIFY_CODES;
        }
        int codesLen = sources.length();
        Random rand = new Random(System.currentTimeMillis());
        StringBuilder verifyCode = new StringBuilder(verifySize);
        for (int i = 0; i < verifySize; i++){
            verifyCode.append(sources.charAt(rand.nextInt(codesLen -1)));
        }
        return verifyCode.toString();
    }

    /**
     * @Author 吴昊天 
     * @Description 订单号生成
     * @Date 0:09 2021/4/18
     * @Param 
     * @return 
     **/
    public static String getCodeByTime(){
        SimpleDateFormat simpleFormatter = new SimpleDateFormat(DatePattern.NORM_DATE_PATTERN);
        String newDate = simpleFormatter.format(new Date());
        String result = "";
        Random random = new Random();
        for ( int i = 0; i < 3; i++){
            result += random.nextInt(10);
        }
        return newDate + result;
    }

    /**
     * @Author 吴昊天
     * @Description 生成邀请码
     * @Date 10:29 2021/4/26
     * @Param
     * @return
     **/
    public static String createShareCode(){
        int maxNum = 36;
        int i;
        int count = 0;
        char[] str ={'0','1','2','3','4','5','6','7','8','9'};
        StringBuffer code = new StringBuffer();
        Random random = new Random();
        while (count < 9){
            i = Math.abs(random.nextInt(maxNum));
            if (i > 0 && i < str.length) {
                code.append(str[i]);
                count++;
            }
        }
        return code.toString();
    }


}

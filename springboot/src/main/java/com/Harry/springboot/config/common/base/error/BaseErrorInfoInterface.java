package com.Harry.springboot.config.common.base.error;

/**
 * @ClassName ExceptionHandler
 * @Description 自定义基础接口类
 * @Author 吴昊天
 * @Date 2021/4/29 10:16
 * @Version 1.0
 **/
public interface BaseErrorInfoInterface {

    /** 错误码
     * @return*/
    String getResultCode();

    /** 错误描述*/
    String getResultMsg();
}

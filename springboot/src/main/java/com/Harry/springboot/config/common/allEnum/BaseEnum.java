package com.Harry.springboot.config.common.allEnum;

import com.Harry.springboot.config.common.base.error.BaseErrorInfoInterface;

/**
 * @Descirption 枚举类
 * @Author Harry
 * @createTime 2020- 05- 29号
 */
public enum BaseEnum implements BaseErrorInfoInterface {

    SUCCESS ("200","成功"),
    BODY_NOT_MATCH("400","请求的数据格式不符"),
    SIGNATURE_NOT_MATCH("401","请求的数字签名不匹配"),
    NOT_FOUND("404","未找到该资源"),
    INTERNAL_SERVER_ERROR("500","服务器内部错误"),
    SERVER_BUSY ("503","服务器正忙，请稍后再试");

    private String code;

    private String msg;

    BaseEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String getResultCode() {
        return code;
    }

    @Override
    public String getResultMsg() {
        return msg;
    }
}

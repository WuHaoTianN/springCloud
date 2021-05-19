package com.Harry.springboot.config.common;

import com.Harry.springboot.config.common.allEnum.BaseEnum;
import com.Harry.springboot.config.common.base.error.BaseErrorInfoInterface;

/**
 * @Description 返回前段封装的一个类
 *
 * @author 吴昊天
 * @date 2020/4/13 12:37
 */
public class ResultBody {

    /**
     * 状态码
     */
    private String code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 响应数据
     */
    private Object resultData;


    public ResultBody(){}

    public ResultBody(Object resultData){
        this.code = "200";
        this.msg = BaseEnum.SUCCESS.getMsg();
        this.resultData = resultData;
    }

    public ResultBody(String code, String msg, Object resultData){
        this.code = code;
        this.msg = msg;
        this.resultData = resultData;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResultData() {
        return resultData;
    }

    public void setData(Object resultData) {
        this.resultData = resultData;
    }

    public ResultBody(BaseErrorInfoInterface errorInfoInterface){
        this.code = errorInfoInterface.getResultCode();
        this.msg = errorInfoInterface.getResultMsg();
    }
}

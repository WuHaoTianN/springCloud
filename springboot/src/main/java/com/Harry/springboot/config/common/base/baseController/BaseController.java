package com.Harry.springboot.config.common.base.baseController;

import com.Harry.springboot.config.common.ResultBody;
import com.Harry.springboot.config.common.allEnum.BaseEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Descirption 所有Controller的父类，封装一些共有的方法
 * @Author Harry
 * @createTime 2020- 05- 29号 12
 */
public abstract class BaseController {

    /**
     * logger日志
     */
    public Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 从thread local获取网络上下文
     * @return
     */
    public HttpServletRequest getServletRequest(){
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes servletRequestAttributes;
        if (requestAttributes instanceof ServletRequestAttributes) {
            servletRequestAttributes = (ServletRequestAttributes) requestAttributes;
            return servletRequestAttributes.getRequest();
        }
        return null;
    }

    /**
     * 获取当前客户端session对象
     * @return
     */
    public HttpSession getSession(){
        return getServletRequest().getSession();
    }


    //---------------------------------封装success方法    开始------------------------------------------------------
    public ResultBody success(){
        ResultBody resultBody = new ResultBody();
        resultBody.setCode(BaseEnum.SUCCESS.getCode());
        resultBody.setMsg(BaseEnum.SUCCESS.getMsg());
        return resultBody;
    }

    public ResultBody success(String msg){
        ResultBody resultBody = new ResultBody();
        resultBody.setCode(BaseEnum.SUCCESS.getCode());
        resultBody.setMsg(msg);
        return resultBody;
    }

    public ResultBody success(Object data){
        ResultBody resultBody = new ResultBody();
        resultBody.setCode(BaseEnum.SUCCESS.getCode());
        resultBody.setMsg(BaseEnum.SUCCESS.getMsg());
        resultBody.setData(data);
        return resultBody;
    }

    public ResultBody success(String msg, Object data){
        ResultBody resultBody = new ResultBody();
        resultBody.setCode(BaseEnum.SUCCESS.getCode());
        resultBody.setMsg(msg);
        resultBody.setData(data);
        return resultBody;
    }
    //---------------------------------封装success方法    结束------------------------------------------------------
    public ResultBody error(String msg){
        ResultBody resultBody = new ResultBody();
        resultBody.setCode(BaseEnum.INTERNAL_SERVER_ERROR.getCode());
        resultBody.setMsg(msg);
        return resultBody;
    }

}

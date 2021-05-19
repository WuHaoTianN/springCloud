package com.Harry.springboot.config.common.base.error;

import com.Harry.springboot.config.common.ResultBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName ExceptionHandler
 * @Description 全局异常类
 * @Author 吴昊天
 * @Date 2021/4/29 10:16
 * @Version 1.0
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    public static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * @Author 吴昊天 
     * @Description 处理自定义的业务异常
     * @Date 17:50 2021/4/29
     * @param request
     * @return 
     **/
    @ExceptionHandler()
    @ResponseBody
    public ResultBody bizExceptionHandler(HttpServletRequest request, Exception e){
        logger.error("发生业务处理异常！异常原因是:{}",e.getMessage());
        ResultBody resultBody = new ResultBody();
        return resultBody;
    }
    
    /**
     * @Author 吴昊天 
     * @Description 处理空指针的异常
     * @Date 17:58 2021/4/29
     * @param 
     * @return 
     **/
    public ResultBody exceptionHandler(HttpServletRequest request, NullPointerException e){
        logger.error("发生空指针异常！原因是:"+e);
        ResultBody resultBody = new ResultBody();

        return resultBody;
    }

    public ResultBody exceptionHandler(HttpServletRequest request, Exception e){
        logger.error("未知异常！原因是："+e);
        ResultBody reuslt = new ResultBody();

        return reuslt;
    }


}

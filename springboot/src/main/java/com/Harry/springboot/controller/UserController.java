package com.Harry.springboot.controller;

import com.Harry.springboot.config.common.ResultBody;
import com.Harry.springboot.config.common.allEnum.BaseEnum;
import com.Harry.springboot.config.common.base.baseController.BaseController;
import com.Harry.springboot.config.common.utils.constant.Constants;
import com.Harry.springboot.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author 吴昊天
 * @Date 2021/4/13 11:14
 * @Version 1.0
 **/
@RestController
@RequestMapping(Constants.USER)
public class UserController extends BaseController {

    /**
     * 用户 业务层
     */
    @Resource
    private UserService userService;


    /**
     * @Author 吴昊天 
     * @Description //TODO
     * @Date 11:18 2021/4/13
     * @Param 
     * @return 
     **/
    @RequestMapping("test")
    public ResultBody test(){
        logger.info("user/test");
        ResultBody resultBody = new ResultBody();
        try{


        }catch (Exception e){
            if (logger.isErrorEnabled()){
                resultBody.setCode(BaseEnum.INTERNAL_SERVER_ERROR.getCode());
                resultBody.setMsg(e.getMessage());
                resultBody.setData(e);
            }
        }
        return resultBody;
    }
}

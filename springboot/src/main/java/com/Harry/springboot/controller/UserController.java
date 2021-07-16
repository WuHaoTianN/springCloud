package com.Harry.springboot.controller;

import com.Harry.springboot.config.common.ResultBody;
import com.Harry.springboot.config.common.base.baseController.BaseController;
import com.Harry.springboot.config.common.utils.constant.Constants;
import com.Harry.springboot.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName UserController
 * @Description 用户控制层
 * @Author 吴昊天
 * @Date 2021/4/13 11:14
 * @Version 1.0
 **/
@RestController
@RequestMapping(Constants.USER)
public class UserController extends BaseController {

    @Resource
    UserService userService;

    @RequestMapping("userList")
    public ResultBody userList(){
        logger.info("user/userList()......");
        ResultBody result = new ResultBody();
        try{

        }catch (Exception e){
            if (logger.isErrorEnabled()){
                logger.error(e.getMessage());
            }
        }
        return result;
    }


    @PostMapping("saveUser")
    public ResultBody saveUser(){
        return null;
    }



}

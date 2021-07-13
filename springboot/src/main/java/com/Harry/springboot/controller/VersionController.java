package com.Harry.springboot.controller;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.http.HttpRequest;
import com.Harry.springboot.config.common.ResultBody;
import com.Harry.springboot.config.common.base.baseController.BaseController;
import com.Harry.springboot.config.common.utils.constant.Constants;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName VersionController
 * @Description 软件版本控制类
 * @Author 吴昊天
 * @Date 2021/6/23 17:46
 * @Version 1.0
 **/
@RestController
@RequestMapping(Constants.VERSION)
public class VersionController extends BaseController {

    /**
     * @Author 吴昊天 
     * @Description 传入版本号，查询是否需要下载最新的安装包
     * @Date 10:50 2021/6/24
     * @param 
     * @return 
     **/
    @RequestMapping("version")
    public ResultBody version(String versionNumber){
        this.logger.info(" 进入 version/version 接口");
        ResultBody resultBody = new ResultBody();
        try{
            if (ObjectUtil.isNotEmpty(versionNumber)){

            }

        }catch (Exception e){
            if (logger.isErrorEnabled()){

            }
        }
        return resultBody;
    }

    public static void main(String[] args) {

        Map paramMap = new HashMap();
        paramMap.put("测试","测试");
        HttpRequest post = HttpRequest.post("https://cn.bing.com/").form(paramMap);
        System.out.println(post);
    }

}

package com.Harry.springboot.service;

import com.Harry.springboot.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

public interface UserService extends IService<User>{

    String test()throws Exception;



}

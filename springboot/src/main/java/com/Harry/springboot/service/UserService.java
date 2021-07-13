package com.Harry.springboot.service;

import com.Harry.springboot.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface UserService extends IService<User>{
    
    /**
     * @Author 吴昊天 
     * @Description 查询用户列表
     * @Date 21:23 2021/7/7
     * @param 
     * @return 
     **/
    List<User>  getUserList(String userName);

    void saveUser(User user);


}

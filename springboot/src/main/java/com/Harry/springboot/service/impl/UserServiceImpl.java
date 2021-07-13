package com.Harry.springboot.service.impl;

import com.Harry.springboot.config.redis.RedisUtils;
import com.Harry.springboot.entity.User;
import com.Harry.springboot.mapper.UserMapper;
import com.Harry.springboot.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author 吴昊天
 * @Date 2021/4/13 11:20
 * @Version 1.0
 **/
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private RedisUtils redisUtils;

    @Override
    public List<User>  getUserList(String userName) {
        List<User> userList = userMapper.selectList(null);

        return userList;
    }

    @Override
    public void saveUser(User user) {

    }
}

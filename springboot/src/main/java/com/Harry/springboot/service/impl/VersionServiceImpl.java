package com.Harry.springboot.service.impl;

import com.Harry.springboot.entity.Version;
import com.Harry.springboot.mapper.VersionMapper;
import com.Harry.springboot.service.VersionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @ClassName VersionServiceImpl
 * @Description TODO
 * @Author 吴昊天
 * @Date 2021/4/16 11:17
 * @Version 1.0
 **/
@Service
public class VersionServiceImpl extends ServiceImpl<VersionMapper, Version> implements VersionService {

}

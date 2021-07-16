package com.Harry.springboot.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.Harry.springboot.config.common.base.error.BizException;
import com.Harry.springboot.config.dto.version.VersionDTO;
import com.Harry.springboot.entity.Version;
import com.Harry.springboot.mapper.VersionMapper;
import com.Harry.springboot.service.VersionService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName VersionServiceImpl
 * @Description TODO
 * @Author 吴昊天
 * @Date 2021/4/16 11:17
 * @Version 1.0
 **/
@Service
public class VersionServiceImpl extends ServiceImpl<VersionMapper, Version> implements VersionService {

    @Resource
    private VersionMapper versionMapper;

    @Override
    public Version checkNumber(String versionNumber) throws BizException {
        QueryWrapper<Version> versionEntityWrapper = new QueryWrapper<>();
        versionEntityWrapper.eq("versionNumber", versionNumber);
        Version version = versionMapper.selectOne(versionEntityWrapper);
        if (ObjectUtil.isNotEmpty(version)){
            version.setVersionNote(null);
        }
        return version;
    }

    @Override
    public void save(VersionDTO versionDTO) {
        Version version = new Version();

    }
}

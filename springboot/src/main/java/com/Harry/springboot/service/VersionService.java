package com.Harry.springboot.service;

import com.Harry.springboot.config.common.base.error.BizException;
import com.Harry.springboot.config.dto.version.VersionDTO;
import com.Harry.springboot.entity.Version;
import com.baomidou.mybatisplus.extension.service.IService;

public interface VersionService extends IService<Version> {

    Version checkNumber(String versionNumber) throws BizException;

    void save(VersionDTO versionDTO);

}

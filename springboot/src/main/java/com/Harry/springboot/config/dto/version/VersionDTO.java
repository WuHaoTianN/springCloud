package com.Harry.springboot.config.dto.version;

import lombok.Data;

/**
 * @ClassName VersionDTO
 * @Description TODO
 * @Author 吴昊天
 * @Date 2021/6/25 15:44
 * @Version 1.0
 **/
@Data
public class VersionDTO {


    private Integer id;


    private String versionNumber;


    private String versionNote;


    private String url;

}

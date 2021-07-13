package com.Harry.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName Version
 * @Description 版本号实体类
 * @Author 吴昊天
 * @Date 2021/4/16 11:13
 * @Version 1.0
 **/
@Data
@TableName("version")
public class Version {

    @TableId(type = IdType.AUTO,value = "id")
    private Integer id;

    @TableField("versionNumber")
    private String versionNumber;

    @TableField("versionNote")
    private String versionNote;

    @TableField("url")
    private String url;

}

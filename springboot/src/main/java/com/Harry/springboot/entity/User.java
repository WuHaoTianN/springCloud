package com.Harry.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * User实体类
 * @author Harry
 * 2020年5月28日
 */
@Data
@TableName("user")
public class User{

	@TableId("id")
	private String id;

	@TableField("name")
	private String name;

	@TableField("number")
	private String sex;

}

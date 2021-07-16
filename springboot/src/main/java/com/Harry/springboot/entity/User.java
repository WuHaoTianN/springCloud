package com.Harry.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 用户实体类
 * @author Harry
 * 2020年5月28日
 */
@Data
@TableName("user")
public class User extends Page{

	/**
	 * 用户主键 UUID
	 */
	@TableId("user_id")
	private Integer userId;

	/**
	 * 昵称
	 */
	@TableField("nick_name")
	private String nickName;

	/**
	 * 真实姓名
	 */
	@TableField("real_name")
	private String realName;

	/**
	 * 用户邮箱
	 */
	@TableField("user_mail")
	private String userMail;

	/**
	 * 登录密码
	 */
	@TableField("login_password")
	private String loginPassword;

	/**
	 * 支付密码
	 */
	@TableField("pay_password")
	private String payPassword;

	/**
	 * 手机号码
	 */
	@TableField("user_mobile")
	private String userMobile;

	/**
	 * 修改时间
	 */
	@TableField("update_time")
	private Date updateTime;

	/**
	 * 注册时间
	 */
	@TableField("user_regtime")
	private Date userRegtime;

	/**
	 * 注册IP
	 */
	@TableField("user_regip")
	private String userRegip;

	/**
	 * 最后登录时间
	 */
	@TableField("user_lasttime")
	private Date userLasttime;

	/**
	 * 最后登录IP
	 */
	@TableField("user_lastip")
	private String userLastip;

	/**
	 * 备注
	 */
	@TableField("user_note")
	private String userNote;

	/**
	 * 性别 M(男) or F(女)
	 */
	@TableField("sex")
	private char sex;

	/**
	 * 生日 例如：2009-11-27
	 */
	@TableField("birth_date")
	private char birthDate;

	/**
	 * 头像图片路径
	 */
	@TableField("pic")
	private String pic;

	/**
	 * 状态 1 正常 0 无效
	 */
	@TableField("status")
	private Integer status;

	/**
	 * 用户积分
	 */
	@TableField("score")
	private Integer score;
}

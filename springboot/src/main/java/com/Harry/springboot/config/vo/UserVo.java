package com.Harry.springboot.config.vo;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName UserVo
 * @Description TODO
 * @Author 吴昊天
 * @Date 2021/7/7 14:49
 * @Version 1.0
 **/
@Data
public class UserVo {


    /**
     * 用户主键 UUID
     */
    private String userId;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 用户邮箱
     */
    private String userMail;

    /**
     * 登录密码
     */
    private String loginPassword;

    /**
     * 支付密码
     */
    private String payPassword;

    /**
     * 手机号码
     */
    private String userMobile;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 注册时间
     */
    private Date userRegtime;

    /**
     * 注册IP
     */
    private String userRegip;

    /**
     * 最后登录时间
     */
    private Date userLasttime;

    /**
     * 最后登录IP
     */
    private String userLastip;

    /**
     * 备注
     */
    private String userMemo;

    /**
     * 性别 M(男) or F(女)
     */
    private char sex;

    /**
     * 生日 例如：2009-11-27
     */
    private char birthDate;

    /**
     * 头像图片路径
     */
    private String pic;

    /**
     * 状态 1 正常 0 无效
     */
    private Integer status;

    /**
     * 用户积分
     */
    private Integer score;



}

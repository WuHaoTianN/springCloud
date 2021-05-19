package com.Harry.springboot.service;

import com.Harry.springboot.entity.User;

/**
 * Service demo
 * @author Harry
 * 2018年7月25日下午5:31:42
 */
public interface DemoService {
	/**
	 * 通过JdbcTemplate方式插入用户信息
	 * @return
	 */
	public int insertUserByJdbcTemplate();
	
	/**
	 *  通过userid查询
	 * @param userid
	 * @return
	 */
	public User queryUserByUserid(String userid);
	
	/**
	 * 通过userid更新username
	 * @param userid
	 * @param username
	 */
	public void updateByUserid(String userid, String username);
}

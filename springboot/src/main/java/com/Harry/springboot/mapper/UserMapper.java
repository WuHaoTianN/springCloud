package com.Harry.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.Harry.springboot.entity.User;

/**
 * User数据访问层接口
 * @author Harry
 * 2018年7月16日下午5:01:17
 */
public interface UserMapper extends BaseMapper<User> {
//	/**
//	 * 通过userid查询
//	 * @param userid
//	 * @return
//	 */
//	public User queryUserByUserid(String userid);
//
//	/**
//	 * 通过userid更新username
//	 * @param map
//	 */
//	public void updateByUserid(HashMap<String,String> map);
}

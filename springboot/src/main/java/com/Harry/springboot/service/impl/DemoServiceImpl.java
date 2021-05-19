package com.Harry.springboot.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.Harry.springboot.entity.User;
import com.Harry.springboot.service.DemoService;
/**
 * 
 * @author Harry
 * 2018年7月25日下午5:35:13
 */
@Service
//指定使用缓存名
@CacheConfig(cacheNames="userCache")
public class DemoServiceImpl implements DemoService {
	
//	@Resource
//	private UserDao userDao;
	
//	@Resource
//	private UserMapper userMapper;

	@Override
	public int insertUserByJdbcTemplate() {
		String s ="";
		StringBuffer S = new StringBuffer();
		Map<String,Object> map = new HashMap<>();
		User user = new User();
		user.setId("1");
		user.setName("harry");
		user.setSex("帅小伙");
//		int result = userDao.insertUser(user);
		return 0;
	}

	@Override
	//@Cacheable:将查询结果缓存到redis中，（key="#p0"）指定传入的第一个参数作为redis的key
	@Cacheable(key="#p0")
	public User queryUserByUserid(String userid) {
//		return userMapper.queryUserByUserid(userid);
		return null;
	}

	@Override
	//@CachePut:指定key为第一个参数userid，将更新的结果同步到redis中
	@CachePut(key = "#p0")
	public void updateByUserid(String userid, String username) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("userid", userid);
		map.put("username", username);
		HashMap hashMap = new HashMap<>(map);
//		userMapper.updateByUserid(map);
	}
}

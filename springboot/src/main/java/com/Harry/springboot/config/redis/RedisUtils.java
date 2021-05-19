package com.Harry.springboot.config.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.types.RedisClientInfo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * redis操作工具类.</br>
 * (基于RedisTemplate)
 * @author Harry
 * 2018年7月19日下午2:56:24
 */
@Component
public class RedisUtils {

	@Resource
	private RedisTemplate<String, String> redisTemplate;

	/**
	 * 读取缓存
	 * 
	 * @param key
	 * @return
	 */
	public String get(final String key) {
		return redisTemplate.opsForValue().get(key);
	}

	/**
	 * 写入缓存
	 */
	public boolean set(final String key, String value) {
		boolean result = false;
		try {
			redisTemplate.opsForValue().set(key, value);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 更新缓存
	 */
	public boolean getAndSet(final String key, String value) {
		boolean result = false;
		try {
			redisTemplate.opsForValue().getAndSet(key, value);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 删除缓存
	 */
	public boolean delete(final String key) {
		boolean result = false;
		try {
			redisTemplate.delete(key);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public List<RedisClientInfo> getAll(){
		List<RedisClientInfo> clientList = new ArrayList<>();
		try{
			 clientList = redisTemplate.getClientList();
		}catch (Exception e){
			e.printStackTrace();
		}
		return clientList;
	}
}

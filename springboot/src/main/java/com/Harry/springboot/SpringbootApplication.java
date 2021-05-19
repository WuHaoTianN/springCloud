package com.Harry.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * SpringBoot启动类
 * @author Harry
 * 2018年7月2日下午5:41:45
 */
@SpringBootApplication
@MapperScan("com.Harry.springboot.mapper")//指定要扫描的Mapper类的包的路径
@EnableCaching//开启缓存功能
public class SpringbootApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);
	
	public static void main(String[] args) {
		if(logger.isDebugEnabled()) {
			logger.debug("SpringBoot starting...");
		}
		SpringApplication.run(SpringbootApplication.class, args);
	}
}

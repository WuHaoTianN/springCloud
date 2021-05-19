package com.Harry.springboot.controller;

import javax.annotation.Resource;

import com.Harry.springboot.config.common.base.baseController.BaseController;
import com.Harry.springboot.config.common.utils.constant.Constants;
import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import org.springframework.web.bind.annotation.*;
import com.Harry.springboot.entity.User;
import com.Harry.springboot.service.DemoService;
import com.aliyun.tea.*;
import com.aliyun.dysmsapi20170525.*;
import com.aliyun.dysmsapi20170525.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import java.util.HashMap;

/**
 * Controller demo
 * @author Harry
 * 2020年5月28日
 */

@RestController
@RequestMapping(Constants.DEMO)
public class DemoController extends BaseController {
	
	@Resource
	private DemoService demoService;

	@RequestMapping("/print")
	public String print() {
		this.logger.info("进入 pring 方法");
		return "hello SpringBoot!";
	}

	
	/**
	 * 通过JdbcTemplate方式插入用户信息
	 * @return
	 */
	@RequestMapping("/insertUserByJdbcTemplate")
	public String insertUserByJdbcTemplate() {
		int result = demoService.insertUserByJdbcTemplate();
		return String.valueOf(result);
		
	}
	
	/**
	 * 通过userid查询
	 * @param userid
	 * @return
	 */
	@GetMapping(value="/queryUserByUserid")
	public String queryUserByUserid(@RequestParam("userid") String userid) {
		User user = demoService.queryUserByUserid(userid);
		return user.toString();
		
	}
	
	/**
	 * 通过userid更新username
	 * @param userid
	 * @param username
	 */
	@GetMapping(value="/updateByUserid")
	public String updateByUserid(@RequestParam("userid") String userid, @RequestParam("username") String username) {
		demoService.updateByUserid(userid,username);
		return userid + "更新username成功!";
	}

//
//	public static com.aliyun.dysmsapi20170525.Client createClient(String accessKeyId, String accessKeySecret) throws Exception {
//		Config config = new Config()
//				// 您的AccessKey ID
//				.setAccessKeyId(accessKeyId)
//				// 您的AccessKey Secret
//				.setAccessKeySecret(accessKeySecret);
//		// 访问的域名
//		config.endpoint = "dysmsapi.aliyuncs.com";
//		return new com.aliyun.dysmsapi20170525.Client(config);
//	}
//
//	public static void main(String[] args_) throws Exception {
//		java.util.List<String> args = java.util.Arrays.asList(args_);
//		com.aliyun.dysmsapi20170525.Client client = DemoController.createClient("accessKeyId", "accessKeySecret");
//		SendSmsRequest sendSmsRequest = new SendSmsRequest()
//				.setPhoneNumbers("18032690551")
//				.setSignName("")
//				.setTemplateCode("");
//		// 复制代码运行请自行打印 API 的返回值
//		client.sendSms(sendSmsRequest);
//	}

}

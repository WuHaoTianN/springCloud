package com.Harry.springboot.config.common.utils.alipay;


import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.dysmsapi20170525.models.SendSmsResponse;
import com.aliyun.teaopenapi.models.Config;

/**
 * @ClassName Sample
 * @Description 支付宝 调用 微信服务
 * @Author 吴昊天
 * @Date 2021/4/13 17:25
 * @Version 1.0
 **/
public class Sample {

    public static  com.aliyun.dysmsapi20170525.Client createClient(String accessKeyId, String accessKeySecret) throws Exception{
        Config config = new Config();
        StringBuffer stringBuffer = new StringBuffer();
        config.accessKeyId = accessKeyId;
        config.accessKeySecret = accessKeySecret;
        return new com.aliyun.dysmsapi20170525.Client(config);
    }

    /**
     * @Author 吴昊天
     * @Description //TODO
     * @Date 15:18 2021/4/13
     * @Param
     * @return
     **/
//    public static void main(String[] args_) throws Exception {
//        java.util.List<String> args = java.util.Arrays.asList(args_);
//        com.aliyun.dysmsapi20170525.Client client = Sample.createClient(com.aliyun.darabonba.env.EnvClient.getEnv("ACCESS_KEY_ID"), com.aliyun.darabonba.env.EnvClient.getEnv("ACCESS_KEY_SECRET"));
//        // 1.发送短信
//        SendSmsRequest sendReq = new SendSmsRequest()
//                .setPhoneNumbers(args.get(0))
//                .setSignName(args.get(1))
//                .setTemplateCode(args.get(2))
//                .setTemplateParam(args.get(3));
//        SendSmsResponse sendResp = client.sendSms(sendReq);
//        String code = sendResp.body.code;
//        if (!com.aliyun.teautil.Common.equalString(code, "OK")) {
//            com.aliyun.teaconsole.Client.log("错误信息: " + sendResp.body.message + "");
//            return ;
//        }
//
//        String bizId = sendResp.body.bizId;
//        // 2. 等待 10 秒后查询结果
//        com.aliyun.teautil.Common.sleep(10000);
//        // 3.查询结果
//        java.util.List<String> phoneNums = com.aliyun.darabonbastring.Client.split(args.get(0), ",", -1);
//
//    }
}

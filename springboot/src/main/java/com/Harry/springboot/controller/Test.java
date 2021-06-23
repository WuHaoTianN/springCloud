package com.Harry.springboot.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 吴昊天
 * @Date 2021/6/4 10:38
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        String urlstr1;
        String urlstr2;
        String text;
        String name;
        String time;
        int a=0;
        String bvid;
        Pattern p1;
        Matcher m1;
        Pattern p2;
        Matcher m2;
        //b站视频的链接
        urlstr1 = "https://www.bilibili.com/video/BV1Kb411W75N/";
        bvid = urlstr1.substring(urlstr1.indexOf("BV"),urlstr1.lastIndexOf("/"));
        urlstr2 = "https://api.bilibili.com/x/player/pagelist?bvid="+bvid;
        //获得网站源码
        text = getURLText(urlstr2, "utf-8");
        p1 = Pattern.compile("part\":\"[\\s\\S]+?\"");
        m1 = p1.matcher(text);
        p2 = Pattern.compile("duration\":[\\s\\S]+?,");
        m2 = p2.matcher(text);
        while(m1.find()) {
            a++;
            if(m2.find()) {
                //此处获得视频名称
                name = m1.group().substring(7,m1.group().length()-1);
                //此处获得播放时长
                time = m2.group().substring(10,m2.group().length()-1);
                //此处这个视频播放链接就是https://www.bilibili.com/video/BV1Kb411W75N?p=第几集
                System.out.println("编号："+a+"  "+name+"  <---->  "+"视频长度： "+Integer.parseInt(time)/60+"分钟"+Integer.parseInt(time)%60+"秒"+"   播放链接：https://www.bilibili.com/video/"+bvid+"?p="+a);
            }
        }
        System.out.println("\n\n总共："+a+"集");
    }
    public static String getURLText(String urlstr,String charset) {
        String temp = "";
        StringBuffer sb = new StringBuffer();
        try {
            URL url = new URL(urlstr);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(),Charset.forName(charset)));
            while((temp=br.readLine())!=null) {
                sb.append(temp);
            }
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch (IOException e) {
            // TODO: handle exception
        }
        return sb.toString();
    }
}

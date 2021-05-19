package com.Harry.springboot.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName RunnableDemo
 * @Description TODO
 * @Author 吴昊天
 * @Date 2021/4/14 17:20
 * @Version 1.0
 **/
public class RunnableDemo implements Runnable{

    private Thread t;
    private String threadName;

    RunnableDemo( String name ){
        this.threadName = name;
        System.out.println("创建中："+ threadName);

    }

    public void run() {
        System.out.println("运行中:" + threadName);
        try{
            for ( int i = 4; i > 0; i-- ){
                System.out.println("threadName" + threadName + ":"+i);
                Thread.sleep(500);
            }

        }catch (Exception e){
            System.out.println("Thread " +  threadName + " interrupted.");
        }
    }

    public void start(){
        System.out.println("线程名称："+threadName);
        if (t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
    public static void main(String[] args) {
        RunnableDemo R1 = new RunnableDemo( "线程一");
        R1.start();
    }
}

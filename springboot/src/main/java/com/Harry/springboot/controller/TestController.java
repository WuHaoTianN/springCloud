package com.Harry.springboot.controller;

import cn.hutool.crypto.digest.DigestUtil;
import org.springframework.util.DigestUtils;

import java.util.HashMap;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author 吴昊天
 * @Date 2021/4/26 16:09
 * @Version 1.0
 **/
public class TestController {

     static HashMap<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        TestController.fib(new Integer(5));
    }

    public static int fib(int N) {
        if (cache.containsKey(N)) {
            return cache.get(N);
        }

        int result;

        if (N < 2) {
            result = N;
        } else {
            result = fib(N - 1) + fib(N - 2);
        }
        cache.put(N, result);
        return result;
    }

}

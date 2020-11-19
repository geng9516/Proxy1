package com.bjpowernode.service.impl;

import com.bjpowernode.service.HelloService;

public class HelloServiceImpl2 implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println("========你好："+name);
    }
}

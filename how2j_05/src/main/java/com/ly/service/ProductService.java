package com.ly.service;

import org.springframework.stereotype.Component;

/**
 * 业务类
 */
// Component表示一个bean，由Spring进行管理
@Component("s")
public class ProductService {
    public void doSomeService(){
        System.out.println("doSomeService");
    }
}

package com.ly.ui;

import com.ly.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
//        ----------------- ApplicationContext ------------------------
        //1.获取核心容器对象
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        //2.根据id获取对象
        AccountService as = (AccountService) ac.getBean("accountService");
        as.saveAccount();


        // 手动关闭容器
        ac.close();

    }
}

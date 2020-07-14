package com.ly.ui;

import com.ly.service.AccountService;
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
//        AccountService as = (AccountService) ac.getBean("accountService");
//        as.saveAccount();


//        AccountService as2 = (AccountService) ac.getBean("accountService2");
//        as2.saveAccount();


        AccountService as3 = (AccountService) ac.getBean("accountService3");
        as3.saveAccount();
        // 手动关闭容器
        ac.close();

    }
}

package com.ly.ui;

import com.ly.factory.BeanFactiry;
import com.ly.service.AccountService;
import com.ly.service.impl.AccountServiceImpl;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {
    public static void main(String[] args) {
        //AccountService accountService = new AccountServiceImpl();
        AccountService as = (AccountService) BeanFactiry.getBean("accountService");
        as.saveAccount();
    }
}

package com.ly.factory;

import com.ly.service.AccountService;
import com.ly.service.impl.AccountServiceImpl;

/**
 * 模拟一个工厂类(该类可能存在jar包中，我们无法通过修改源码的方式来提供默认构造函数)
 */
public class InstanceFactory {
    public AccountService getAccountService(){
        return new AccountServiceImpl();
    }
}

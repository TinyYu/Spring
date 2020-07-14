package com.ly.service.impl;

import com.ly.service.AccountService;

/**
 * 业务层实现类
 */
public class AccountServiceImpl implements AccountService {
//    private AccountDao accountDao = new AccountDaoImpl();

    public AccountServiceImpl(){
        System.out.println("对象创建了");
    }
    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了");
    }

    public void init() {
        System.out.println("对象初始化了");
    }
    public void destroy() {
        System.out.println("对象销毁");
    }
}

package com.ly.service.impl;

import com.ly.dao.AccountDao;
import com.ly.dao.impl.AccountDaoImpl;
import com.ly.service.AccountService;

/**
 * 业务层实现类
 */
public class AccountServiceImpl implements AccountService {
//    private AccountDao accountDao = new AccountDaoImpl();
    private AccountDao accountDao = new AccountDaoImpl();

    public AccountServiceImpl(){
        System.out.println("对象创建了");
    }
    public void saveAccount() {
        accountDao.saveAccount();
    }
}

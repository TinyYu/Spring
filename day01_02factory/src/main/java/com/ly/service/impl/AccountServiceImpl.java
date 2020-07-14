package com.ly.service.impl;

import com.ly.dao.AccountDao;
import com.ly.dao.impl.AccountDaoImpl;
import com.ly.factory.BeanFactiry;
import com.ly.service.AccountService;

/**
 * 业务层实现类
 */
public class AccountServiceImpl implements AccountService {
//    private AccountDao accountDao = new AccountDaoImpl();
    private AccountDao accountDao = (AccountDao) BeanFactiry.getBean("accountDao");
    public void saveAccount() {
        accountDao.saveAccount();
    }
}

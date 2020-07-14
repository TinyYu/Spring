package com.ly.dao.impl;

import com.ly.dao.AccountDao;
import org.springframework.stereotype.Repository;

/**
 * 账户的持久层实现类
 */
@Repository("accountDao1")
public class AccountDaoImpl implements AccountDao {

    public void saveAccount() {
        System.out.println("保存账户1111");
    }
}

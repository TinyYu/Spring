package com.ly.test;

import com.ly.domain.Account;
import com.ly.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 使用junit单元测试，测试配置
 */
public class AccountServiceTest {
    @Test
    public void testFindAll(){
        // 1. 获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 2.获取业务层对象
        AccountService as = (AccountService) ac.getBean("accountService");
        // 3.执行方法
        List<Account> accounts = as.findAllAccount();
        for (Account account : accounts){
            System.out.println(account);
        }
    }

    @Test
    public void testFindOne(){
        // 1. 获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 2.获取业务层对象
        AccountService as = (AccountService) ac.getBean("accountService");
        // 3.执行方法
        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSave(){
        // 1. 获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 2.获取业务层对象
        AccountService as = (AccountService) ac.getBean("accountService");
        // 3.执行方法
        Account account = new Account();
        account.setName("ddd");
        account.setMoney((float)1000);
        as.saveAccount(account);
    }

    @Test
    public void testUpdate(){
        // 1. 获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 2.获取业务层对象
        AccountService as = (AccountService) ac.getBean("accountService");
        // 3.执行方法
        Account account = new Account();
        account.setName("aaa");
        account.setMoney((float)1000);
        account.setId(1);
        as.updateAccount(account);
    }

    @Test
    public void testDelete(){
        // 1. 获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 2.获取业务层对象
        AccountService as = (AccountService) ac.getBean("accountService");
        // 3.执行方法
        as.deleteAccount(1);
    }
}

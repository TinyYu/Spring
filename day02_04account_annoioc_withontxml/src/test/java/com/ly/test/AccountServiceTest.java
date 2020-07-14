package com.ly.test;

import com.ly.domain.Account;
import com.ly.service.AccountService;
import config.SpringConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * spring整合junit的配置
 *      1.导入spring整合junit的jar(坐标)
 *      2.使用Junit提供的一个注解把原有的main方法替换，替换为spring提供的
 *          @RunWith
 *      3.告知spring的运行器，spring和ioc创建是基于xml还是注解的，并说明位置
 *          @ContextConfiguration
 *              location: 指定xml文件的位置，加上classpath关键字，表示在类路径下
 *              classes: 指定注解类所在的位置
 *          注意: spring 5.x版本时,要求junit的jar必须是4.12及以上
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class AccountServiceTest {

    @Autowired
    private  AccountService as = null;

    @Test
    public void testFindAll(){

        // 3.执行方法
        List<Account> accounts = as.findAllAccount();
        for (Account account : accounts){
            System.out.println(account);
        }
    }

    @Test
    public void testFindOne(){
        // 3.执行方法
        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSave(){
        // 3.执行方法
        Account account = new Account();
        account.setName("ddd");
        account.setMoney((float)1000);
        as.saveAccount(account);
    }

    @Test
    public void testUpdate(){
        // 3.执行方法
        Account account = new Account();
        account.setName("aaa");
        account.setMoney((float)1000);
        account.setId(1);
        as.updateAccount(account);
    }

    @Test
    public void testDelete(){
        // 3.执行方法
        as.deleteAccount(1);
    }
}

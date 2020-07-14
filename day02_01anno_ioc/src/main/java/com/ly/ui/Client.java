package com.ly.ui;

import com.ly.dao.AccountDao;
import com.ly.dao.impl.AccountDaoImpl;
import com.ly.service.AccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {


    public static void main(String[] args) {
        //1.获取核心容器对象
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取bean对象
        AccountService as = (AccountService) ac.getBean("accountService");
        AccountService as1 = (AccountService) ac.getBean("accountService");

//        System.out.println(as);
//
//        AccountDao adao = (AccountDao) ac.getBean("accountDao");
//        System.out.println(adao);
//        as.saveAccount();
//        System.out.println(as == as1);
        as.saveAccount();
        ac.close();
    }
}

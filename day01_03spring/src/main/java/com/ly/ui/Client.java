package com.ly.ui;

import com.ly.dao.AccountDao;
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

    /**
     * 获取spring的Ioc核心容器，并根据id获取对象
     *
     * ApplicationContext的三个常用实现类
     *      ClassPathXmlApplicationContext: 可以加载类路径下的配置文件，要求配置文件必须在类路径下。
     *      FileSystemXmlApplicationContext: 可以加载磁盘任意路径下的配置文件(必须有访问权限)。
     *      AnnotationConfigApplicationContext: 是用于读取注解创建容器的
     *
     * 核心容器的两个接口
     *      ApplicationContext:    单例对象适用(更多采用此接口)
     *          在构建核心容器时，创建对象采取的策略是采用立即加载的方式。只要一读取配置文件马上就创建配置文件中配置的对象
     *      BeanFactory:           多列对象使用
     *          在构建核心容器时，创建对象采取的策略时采用延迟加载的方式。什么时候根据id获取对象了，这个时候才真正创建对象
     * @param args
     */
    public static void main(String[] args) {
        //----------------- ApplicationContext ------------------------
//        //1.获取核心容器对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//
//        //2.根据id获取对象
//        AccountService as = (AccountService) ac.getBean("accountService");
//        AccountDao adao = ac.getBean("accountDao",AccountDao.class);
//
//        System.out.println(as);
//        System.out.println(adao);
//
//        as.saveAccount();


        //------------------- BeanFactory ----------------------------------
        Resource resource = new ClassPathResource("bean.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        AccountService as = (AccountService) beanFactory.getBean("accountService");
        System.out.println(as);
    }
}

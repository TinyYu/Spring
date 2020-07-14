package com.ly.service.impl;

import com.ly.dao.AccountDao;
import com.ly.dao.impl.AccountDaoImpl;
import com.ly.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * 业务层实现类
 *
 * xml的配置
 *  <bean id="accountService" class="com.ly.service.impl.AccountServiceImpl" scope="" init-method="" destroy-method="">
 *      <property name="" value="" / ref=""></property>
 *  </bean>
 *
 *  1.用于创建的注解
 *      作用相和xml配置文件中编写一个<bean>标签实现的功能是一样的
 *      @Component:
 *          用于把当前类对象存入spring容器中
 *          属性:
 *              value: 用于指定bean的id，如果不写，默认值是当前类的类名首字母改小写
 *
 *      @Controller:
 *          一般用于表现层
 *      @Service:
 *          一般用于业务层
 *      @Repository:
 *          一般用于持久层
 *      以上三个注解，作用和属性与@Component一样，这三个注解是spring框架提供明确的三层使用的注解，使三层对象更加清晰
 *
 *
 *
 *  2.用于注入数据
 *      和在xml配置文件中的bean标签中写一个<property>标签的作用是一样的
 *      @Autowired:
 *          自动按照类型注入，只要容器中有唯一的一个bean对象类型和要注入的变量类型匹配，就可以注入成功
 *          如果没有匹配的bean对象，注入失败
 *          如果有多个匹配时
 *              出现位置：
 *                  可以在变量上，也可以在方法上
 *              在使用注解注入时，set方法不在是必须的
 *      @Qualifier:
 *          在按照类中注入的基础上再按照名称注入。在给类成员注入时不能单独使用。但是在给方法参数注入时可以
 *          注: 在给类成员注入时必须和@Autowired一起使用
 *          属性:
 *              value: 用于指定注入bean的id
 *      @Resource:
 *          作用: 直接按照bean的id注入。可以单独使用
 *          属性:
 *              name: 用于指定bean的id。
 *      以上三个注入都只能注入其他bean类型的数据，而基本类型和String类型都无法使用这三个注解实现。集合类型的注解只能通过xml来实现
 *
 *      @Value:
 *          作用: 用于注入基本类型和String类型
 *          属性:
 *              value: 用于指定数据的值。它可以使用spring中的SpEL（也就是spring的el表达式）
 *
 *
 *  3.用于改变作用范围
 *      和xml配置文件中scope属性实现的功能是一样的
 *      @Scope
 *          作用: 用于指定bean的作用范围
 *          属性:
 *              value: 指定范围的取值。常用取值: singleton(单例 -- 默认值) prototype(多例)
 *
 *
 *
 *  4.用于生命周期相关
 *      和xml配置文件中init-method和destroy-method的作用是一样的
 *      @PreDestroy
 *          作用: 用于指定销毁方法 （多例模式下使用java的垃圾回收机制销毁，该注解不起作用）
 *      @PostConstruct
 *          作用: 用于指定初始化方法
 */
@Service("accountService")
//@Scope("prototype")
public class AccountServiceImpl implements AccountService {
//    @Autowired
//    @Qualifier("accountDao2")
    @Resource(name = "accountDao1")
    private AccountDao accountDao2;
    public void saveAccount() {
        accountDao2.saveAccount();
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化方法");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("销毁方法");
    }
}

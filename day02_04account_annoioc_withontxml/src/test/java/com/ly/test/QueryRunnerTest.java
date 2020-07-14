package com.ly.test;

import config.SpringConfiguration;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试QueryRunner是否单例
 */
public class QueryRunnerTest {
    @Test
    public void testQueryRunner(){
        // 1. 获取容器
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        // 2.获取QueryRunner对象
        QueryRunner runner = (QueryRunner) ac.getBean("runner");
        QueryRunner runner2 = (QueryRunner) ac.getBean("runner");
        System.out.println(runner == runner2);
    }
}

package com.ly;

import com.ly.pojo.Category;
import com.ly.pojo.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试
 */
public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Category category = (Category) context.getBean("c");
        System.out.println(category.getName());

        Product product = (Product) context.getBean("p");
        System.out.println(product.getName());
    }
}

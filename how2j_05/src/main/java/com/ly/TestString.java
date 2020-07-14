package com.ly;

import com.ly.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestString {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService) context.getBean("s");
        productService.doSomeService();
    }
}

package com.ly.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class Product {
    private int id;
    private String name;

    // 注解方式获取category属性值
//    @Autowired

    // 使用Resource方式
    @Resource(name = "c")
    private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    // 也可以在set方法上添加注解
//    @Autowired
    public void setCategory(Category category) {
        this.category = category;
    }
}

package com.at.unittest;

import org.junit.Test;

import java.util.ArrayList;

public class Demo02Junit {
    /**
     * 测试添加功能
     */
    @Test
    public void insert() {
        boolean result = new Category().insertCategory("A", "B", "C");
        System.out.println("result = " + result);
    }

    /**
     * 测试查询功能
     */
    @Test
    public void query() {
        ArrayList<String> list = new Category().queryCategory();
        System.out.println("list = " + list);
    }
}

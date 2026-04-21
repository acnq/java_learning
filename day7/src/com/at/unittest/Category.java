package com.at.unittest;

import java.util.ArrayList;

public class Category {
    /**
     * 添加功能
     */
    public boolean insertCategory(String ...arr) {
        // 创建集合存储数据
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            // 添加元素
            list.add(arr[i]);
        }
        return true;
    }

    /**
     * 查询功能
     */
    public  ArrayList<String> queryCategory() {
        // 创建集合
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        return list;
    }
}

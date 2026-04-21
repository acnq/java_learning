package com.at.e_cast;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("吃肉");
    }
    // 特有方法
    public void lookHome() {
        System.out.println("看家");
    }
}

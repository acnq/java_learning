package com.at.e_cast;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    // 特有方法
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

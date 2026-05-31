package com.at.b_gc;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person);

        person = null;

        System.gc();//运行垃圾回收器
    }
}

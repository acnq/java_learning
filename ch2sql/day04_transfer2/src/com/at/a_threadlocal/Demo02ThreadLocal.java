package com.at.a_threadlocal;

public class Demo02ThreadLocal {
    public static void main(String[] args) {
        ThreadLocal<String> t1 = new ThreadLocal<>();
        t1.set("abc");
        String s = t1.get();
        System.out.println("s = " + s);
        new Thread(() -> {
            String s1 = t1.get();
            System.out.println("s1 = " + s1);
        }).start();
    }
}

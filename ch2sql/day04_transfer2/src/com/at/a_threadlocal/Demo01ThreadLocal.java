package com.at.a_threadlocal;

public class Demo01ThreadLocal {
    public static void main(String[] args) {
        ThreadLocal<String> t1 = new ThreadLocal<>();
        t1.set("abc");
        t1.set("def");
        String s = t1.get();
        System.out.println("s = " + s);

        t1.remove();
        String s1 = t1.get();
        System.out.println("s1 = " + s1);
    }
}

package com.at.d_singleton;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Singleton singleton = Singleton.getInstance();
            System.out.println("singleton = " + singleton);
            Singleton2 singleton2 = Singleton2.getInstance();
            System.out.println("singleton2 = " + singleton2);
        }
    }
}

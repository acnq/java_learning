package com.at.a_interfac;

public interface USB {
    public static final int NUM = 10;
    public abstract void open();
    public abstract void close();
    public default void dmethod() {
        System.out.println("默认方法");
    }
    public static void smethod() {
        System.out.println("静态方法");
    }
}

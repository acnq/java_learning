package com.at.b_priority;

public class Test01 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("A");
        MyThread t2 = new MyThread();
        t2.setName("B");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        // 设置优先级
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        t2.start();
    }
}

package com.at.a_thread;

public class Test01 {
    public static void main(String[] args) throws InterruptedException{
        MyThread t1 = new MyThread();
        // 设置名字
        t1.setName("赵四");
        t1.start(); // 比较t1.run()
        // t1.run() 不会真正多线程执行，而是先直接执行t1,

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000L);
            System.out.println(Thread.currentThread().getName() + "执行" + i);
        }
    }
}

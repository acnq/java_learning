package com.at.e_join;

public class Test01 {
    public static void main(String[] args) throws InterruptedException{
        MyThread t1 = new MyThread();
        t1.setName("进程1");
        t1.start();
        /*
           join(),插入线程
           将t1插入到当前线程前面,现在只有两条线程,一个t1,一个主线程
           我们想将t1插入到主线程前面,主线程就是当前线程
         */
        t1.join();

        for (int i = 0; i < 10 ; i++) {
            System.out.println(Thread.currentThread().getName() + "执行" + i);
        }
    }
}

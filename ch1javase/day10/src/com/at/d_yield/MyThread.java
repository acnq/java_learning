package com.at.d_yield;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "执行" + i);

            // 设置礼让线程
            Thread.yield();
        }
    }
}

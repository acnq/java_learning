package com.at.c_daemon;

public class MyThread01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "执行" + i);
        }
    }
}

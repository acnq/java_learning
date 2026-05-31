package com.at2.c_syncmetd;

public class MyTicket implements Runnable{
    int ticket = 100;

    // Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100L); // 防止一个进程抢完所有资源
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            method();
        }
    }

    public synchronized void method() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "购买第" + ticket + "张票");
            ticket--;
        }
    }
}

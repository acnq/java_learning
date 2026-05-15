package com.at2.a_unsafe;

public class MyTicket implements Runnable{
    int ticket = 100;
    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "购买第" + ticket + "张票");
                ticket--;
            }
        }
    }
}

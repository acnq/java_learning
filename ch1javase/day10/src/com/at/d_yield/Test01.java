package com.at.d_yield;

import com.at.c_daemon.MyThread01;

public class Test01 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("礼让进程1");
        MyThread t2 = new MyThread();
        t2.setName("礼让进程2");

        t1.start();
        t2.start();
    }
}

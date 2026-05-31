package com.at.c_daemon;

public class Test01 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("普通进程");

        MyThread01 t2 = new MyThread01();
        t2.setDaemon(true);
        t2.setName("守护进程");

        t1.start();
        t2.start();
    }
}

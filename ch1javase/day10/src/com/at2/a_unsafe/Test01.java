package com.at2.a_unsafe;

public class Test01 {
    public static void main(String[] args) {
        MyTicket myTicket = new MyTicket();
        Thread t1 = new Thread(myTicket, "A");
        Thread t2 = new Thread(myTicket, "B");
        Thread t3 = new Thread(myTicket, "C");

        t1.start();
        t2.start();
        t3.start();
    }
}

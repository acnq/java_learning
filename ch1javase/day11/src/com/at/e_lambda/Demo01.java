package com.at.e_lambda;

public class Demo01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1");
            }
        }).start();

        System.out.println("======================");

        // Lambda 表达式
        new Thread(() -> System.out.println("线程2")).start();
    }
}

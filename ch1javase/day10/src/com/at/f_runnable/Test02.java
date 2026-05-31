package com.at.f_runnable;

public class Test02 {
    public static void main(String[] args) {
        /*
           new Thread(Runnable r)
           new Thread(Runnable r,String name)

         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "执行" + i);
                }
            }
        }, "t1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "执行" + i);
                }
            }
        }, "t2").start();
    }
}

package com.at.f_runnable;

public class Test01 {
    public static void main(String[] args) throws InterruptedException{
        MyRunnable myRunnable = new MyRunnable();

        /*
            创建Thread对象,传入实现类对象
            a.Thread(Runnable r)
            b.Thread(Runnable r,String name) 可以设置线程名字
         */
        Thread t1 = new Thread(myRunnable, "t1");
        t1.start();

        for (int i = 0; i < 10 ; i++) {
            System.out.println(Thread.currentThread().getName() + "执行" + i);
        }
    }
}

package com.at.d_singleton;

public class Singleton {
    /**
     * 由于我们一个类只产生一个对象
     * 所以我们就不能让外界随便new
     * 所以我们需要将构造方法私有化
     */
    private Singleton() {

    }

    /**
     * 由于是饿汉式,需要我们自己赶紧new一个对象出来
     * 所以我们需要在new的时候,将其变成静态的
     *
     * 又由于我们new出来的对象不能随便让外界通过类名调用
     * 所以将其再变成private的
     */
    private static Singleton singleton = new Singleton();

    /**
     *  定义一个公共的接口,将内部的对象返回给外界
     */
    public static Singleton getInstance() {
        return singleton;
    }
}

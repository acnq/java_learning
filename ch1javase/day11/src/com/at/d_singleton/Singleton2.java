package com.at.d_singleton;

public class Singleton2 {
    /**
     * 由于我们一个类只产生一个对象
     * 所以我们就不能让外界随便new
     * 所以我们需要将构造方法私有化
     */
    private Singleton2() {}

    /**
     * 由于是懒汉式,不着急new对象了
     */
    private static Singleton2 singleton2 = null;

    /**
     * 定义一个公共的接口,将内部的对象返回给外界
     */

    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            synchronized (Singleton2.class) {
                // 通过锁防止并发过程中重复创建singleton2
                if (singleton2 == null) {
                    singleton2 = new Singleton2();
                }
            }
        }
        // singleton2 != null 直接返回就可以了,也不用考虑锁
        return singleton2;
    }
}

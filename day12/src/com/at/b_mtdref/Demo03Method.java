package com.at.b_mtdref;

import java.util.function.Supplier;

public class Demo03Method {
    public static void method(Supplier<Double> supplier) {
        Double v = supplier.get();
        System.out.println(" v = " + v);
    }
    public static void main(String[] args) {
        method(new Supplier<Double>() {
            /**
             * get方法是重写的方法,无参,返回值类型double
             * random方法无参,返回值类型double
             */
            @Override
            public Double get() {
                return Math.random();
            }
        });

        System.out.println("--------------------");
        method(() -> Math.random());

        System.out.println("=====================");
        method(Math::random);
    }
}

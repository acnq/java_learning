package com.at.b_mtdref;

import java.util.function.Supplier;

public class Demo02Method {
    public static void method(Supplier<String> supplier) {
        String s = supplier.get();
        System.out.println("s = " + s);
    }
    public static void main(String[] args) {
        method(new Supplier<String>() {
            /**
             *  get方法是重写的方法,无参,返回值类型String
             *  trim方法无参,返回值类型String
             */
            @Override
            public String get() {
                return " abc ".trim();
            }
        });

        System.out.println("------------------------");
        method(() -> "abc".trim());

        System.out.println("=========================");
        method(" abc "::trim);
    }
}

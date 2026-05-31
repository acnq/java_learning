package com.at.g_funcIntf;

import java.util.function.Consumer;

public class Demo02Consumer {
    public static void method(Consumer<String> consumer, String s) {
        consumer.accept(s);
    }

    public static void main(String[] args) {
        method(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.length());
            }
        }, "abcdefg");

        System.out.println("======================");

        method(s -> System.out.println(s.length()), "abcdefg");
    }
}

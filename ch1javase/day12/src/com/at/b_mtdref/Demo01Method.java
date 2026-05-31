package com.at.b_mtdref;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo01Method {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("AB", "CD", "EF", "G", "AB");
        stream.forEach(new Consumer<String>() {
            /**
             * accept是重写的方法,
             * 参数是一个String的,没有返回值
             * println有一个String的参数,没有返回值
             * @param s the input argument
             */
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("=======================");
        Stream<String> stream2 = Stream.of("AB", "CD", "EF", "G", "AB");
        stream2.forEach(System.out::println);
    }
}

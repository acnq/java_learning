package com.at.a_stream;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo03Stream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A", "B", "C");

        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


        System.out.println("===================");
        Stream<String> stream2 = Stream.of("A", "B", "C");
        // 必须重建一个，因为原来那个stream再遍历之后就“耗尽”了；
        stream.forEach(s -> System.out.println(s));
    }
}

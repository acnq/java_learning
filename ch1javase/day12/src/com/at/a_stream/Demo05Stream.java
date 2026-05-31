package com.at.a_stream;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo05Stream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("AB", "BC", "C", "D");
        Stream<String> stream1 = stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() >= 2;
            }
        });

        stream1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("================");
        Stream<String> stream2 = Stream.of("AB", "BC", "C", "D");
        stream2.filter(s ->s.length() >= 2).forEach(s -> System.out.println(s));

    }
}

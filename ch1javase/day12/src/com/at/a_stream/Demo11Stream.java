package com.at.a_stream;

import java.util.function.Function;
import java.util.stream.Stream;

public class Demo11Stream {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        stream.map(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return "" + integer;
            }
        }).forEach(s -> System.out.println(s + 1));

        System.out.println("==================");
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
        stream2.map(s -> s + "").forEach(s -> System.out.println(s + 1));
    }
}

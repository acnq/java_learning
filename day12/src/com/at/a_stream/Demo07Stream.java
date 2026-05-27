package com.at.a_stream;

import java.util.stream.Stream;

public class Demo07Stream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A", "AB", "BC", "DE");
        stream.skip(3).forEach(s -> System.out.println(s));
    }
}

package com.at.a_stream;

import java.util.stream.Stream;

public class Demo08Stream {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("A", "AB", "BC", "DE");
        Stream<String> stream2 = Stream.of("Z", "XY", "WZ", "UV");

        Stream.concat(stream1, stream2).forEach(s -> System.out.println(s));

    }
}

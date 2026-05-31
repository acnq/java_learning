package com.at.a_stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo09Stream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A", "AB", "BC", "DE");
        List<String> list = stream.collect(Collectors.toList());
        System.out.println(list);
    }
}

package com.at.a_stream;

import java.util.stream.Stream;

public class Demo06Stream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("AB", "AC", "B", "C");
        stream.limit(3).forEach(s-> System.out.println(s));
    }
}

package com.at.a_stream;

import java.util.stream.Stream;

public class Demo10Stream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("AB", "CD", "EF", "G", "AB");
        stream.distinct().forEach(s -> System.out.println(s));

        Stream<Person> stream2 = Stream.of(new Person("A", 10), new Person("B", 12), new Person("A", 10));
        stream2.distinct().forEach(p -> System.out.println(p));
    }
}

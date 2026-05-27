package com.at.a_stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo02Stream {
    public static void main(String[] args) {
        /**
         * 针对集合
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Stream<String> stream = list.stream();
        System.out.println(stream);

        /**
         * 针对数组
         */
        Stream<String> stream2 = Stream.of("A", "B", "C");
        System.out.println("stream2 = " + stream2);
    }
}

package com.at.g_funcIntf;

import java.util.function.Predicate;

public class Demo04Predicate {
    public static void method(Predicate<String> predicate, String s) {
        boolean result = predicate.test(s);
        System.out.println("result = " + result);
    }

    public static void main(String[] args) {
        method(s -> s.endsWith("g"), "abcdefg");
    }
}

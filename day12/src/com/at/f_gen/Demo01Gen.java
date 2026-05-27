package com.at.f_gen;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Demo01Gen {
    public static void method(ArrayList<?> list) {
        for (Object o: list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        method(list1);
        method(list2);
    }
}

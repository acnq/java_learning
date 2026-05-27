package com.at.d_collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("A");
        collection.add("B");
        collection.add("C");
        System.out.println(collection);

        Collection<String> collection1 = new ArrayList<>();
        collection1.add("X");
        collection1.add("Y");
        collection1.add("Z");
        collection.addAll(collection1);
        System.out.println(collection);

        collection.clear();
        System.out.println(collection);

        System.out.println(collection.contains("Y"));

        System.out.println(collection.isEmpty());

        collection1.remove("X");
        System.out.println(collection1.size());
        Object[] arr = collection1.toArray();
        System.out.println(Arrays.toString(arr));
    }
}

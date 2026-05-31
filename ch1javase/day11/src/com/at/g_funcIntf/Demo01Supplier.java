package com.at.g_funcIntf;

import java.util.Arrays;
import java.util.function.Supplier;

public class Demo01Supplier {
    public static void method(Supplier<Integer> supplier) {
        Integer element = supplier.get();
        System.out.println("element = " + element);
    }
    public static void main(String[] args) {
        method(new Supplier<Integer>() {
            @Override
            public Integer get() {
                int[] arr = {4, 3, 4, 56, 7, 6, 4};
                Arrays.sort(arr);
                return arr[arr.length - 1];
            }
        });

        System.out.println("======================");

        method(() -> {
            int[] arr = {4, 3, 4, 56, 7, 6, 4};
            Arrays.sort(arr);
            return arr[arr.length - 1];
        });
    }

}

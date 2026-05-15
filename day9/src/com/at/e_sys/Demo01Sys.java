package com.at.e_sys;

import java.util.Arrays;

public class Demo01Sys {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("哈哈哈");
            }
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);

        System.out.println("====================");

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[10];
        System.arraycopy(arr1, 0, arr2, 0, 2);
        System.out.println(Arrays.toString(arr2));
        System.exit(0);
    }
}

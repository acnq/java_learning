package com.at.e_sys;

import java.util.Arrays;

public class Demo2Arrays {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("=======================");

        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        int idx = Arrays.binarySearch(arr2, 5);
        System.out.println("idx = " + idx);

        System.out.println("======================");

        int[] arr3 = {1,2,3,4,5};
        int[] newArr = Arrays.copyOf(arr3, 10);
        System.out.println(Arrays.toString(newArr));
    }
}

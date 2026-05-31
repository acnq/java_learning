package com.at.c_arr;

import java.util.Arrays;

public class Demo02Bub {
    public static void  main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bub(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bub(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
            System.out.println(Arrays.toString(arr));
        }
    }

}

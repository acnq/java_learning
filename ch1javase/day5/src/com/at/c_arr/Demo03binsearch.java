package com.at.c_arr;

public class Demo03binsearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int idx = binSearch(arr, 7);
        System.out.println("idx = " + idx);
    }

    public static int binSearch(int[] arr, int key) {
        int min = 0;
        int max = arr.length - 1;
        int mid = 0;
        while (min <= max) { // = 还要找一步
            mid = (min + max) / 2;
            if (key > arr[mid]) {
                min = mid + 1;
            } else if (key < arr[mid]) {
                max = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

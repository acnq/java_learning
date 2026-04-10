package com.at.a_varvar;

public class Demo01Accum {
    public static void main(String[] args) {
        method(1, 2, 3, 4, 5, 10);
    }

    public static void method(int ... arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("sum = " +sum);
    }
}

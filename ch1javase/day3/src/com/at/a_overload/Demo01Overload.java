package com.at.a_overload;

public class Demo01Overload {
    public static void main(String[] args) {
        sum(10, 20);
        sum(10, 20, 30);
        sum(10, 20, 30, 40);
    }

    public  static void sum(int a, int b) {
        int sum = a + b;
        System.out.println("sum = " + sum);
    }

    public static void sum(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("sum = " + sum);
    }

    public static void sum(int a, int b, int c, int d) {
        int sum = a + b + c +d;
        System.out.println("sum = " + sum);
    }
}

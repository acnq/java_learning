package com.at.b_rec;

public class Demo01To3 {
    public static void main(String[] args) {
        method(3);
    }

    public static void  method (int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        n--;
        method(n);
    }
}

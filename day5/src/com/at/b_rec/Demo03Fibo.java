package com.at.b_rec;

public class Demo03Fibo {
    public static void main(String[] args) {
        int res = fibo(7);
        System.out.println(res);
    }
    public static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}

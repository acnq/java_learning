package com.at.b_rec;

public class Demo02factor {
    static public void main(String[] args) {
        int res = factor(5);
        System.out.println(res);
    }

    static public int factor(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factor(n - 1);
        }
    }
}

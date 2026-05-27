package com.at.b_mtdref;

import java.util.function.Function;

public class Demo05Method {
    public static void method(Function<Integer, int[]> function, Integer len) {
        int [] arr = function.apply(len);
        System.out.println(arr.length);
    }
    public static void main(String[] args) {
        method(new Function<Integer, int[]>() {
            /*
                apply方法重写,参数类型Integer,返回值类型int[]
                int[] arr = new int[integer]
                参数为Integer,返回值类型int[]
             */
            @Override
            public int[] apply(Integer integer) {
                return new int[integer];
            }
        }, 100);

        System.out.println("==========================");
        method(len->new int[len], 100);
        System.out.println("=========================");
        method(int[]::new, 100);

    }
}

package com.at.a_varvar;

public class Demo02Concat {
    public static void main(String[] args) {
        String res = concat("a", "b", "cd");
        System.out.println(res);
    }
    public static String concat(String...arr) {
        StringBuilder res = new StringBuilder();
        for (String s : arr) {
            res.append(s);
        }
        return res.toString();
    }
}

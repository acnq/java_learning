package com.at.d_newdate;

import java.time.LocalDate;

public class Demo06LocalDate {
    public static void main(String[] args) {
        LocalDate local1 = LocalDate.now();
        System.out.println("local1 = " + local1);

        System.out.println("=====================");

        LocalDate local2 = LocalDate.of(2000, 10, 1);
        System.out.println("local2 = " + local2);
    }
}

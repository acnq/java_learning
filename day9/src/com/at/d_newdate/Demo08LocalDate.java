package com.at.d_newdate;

import java.time.LocalDate;

public class Demo08LocalDate {
    public static void main(String[] args) {
        LocalDate local1 = LocalDate.of(2000, 10, 10);
        System.out.println(local1.getYear());
        System.out.println(local1.getMonthValue());
        System.out.println(local1.getDayOfMonth());
    }
}

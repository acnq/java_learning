package com.at.d_newdate;

import java.time.LocalDate;

public class Demo09LocalDate {
    public static void main(String[] args) {
        LocalDate local1 = LocalDate.now();
        LocalDate localDate = local1.withYear(2000).withMonth(10).withDayOfMonth(15);
        System.out.println("localDate = " + localDate);
    }
}

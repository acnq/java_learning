package com.at.d_newdate;

import java.time.LocalDate;

public class Demo10LocalDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate2 = localDate.plusYears(1);
        System.out.println(localDate2.getYear());

        LocalDate localDate1 = localDate.minusYears(1);
        System.out.println(localDate1.getYear());
    }
}

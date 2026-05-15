package com.at.d_newdate;

import java.time.LocalDate;
import java.time.Period;

public class Demo11Period {
    public static void main(String[] args) {
        LocalDate local1 = LocalDate.of(2023, 10, 10);
        LocalDate local2 = LocalDate.of(2024, 11, 9);

        Period period = Period.between(local1, local2);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}

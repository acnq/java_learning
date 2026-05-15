package com.at.a_date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        Date  date1 = new Date();
        System.out.println(date1.getTime());

        date1.setTime(1000L);
        System.out.println(date1);
    }
}

package com.at.b_calendar;

import java.util.Calendar;
import java.util.Date;

public class Demo03Calendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println("year = " + year);

        calendar.set(Calendar.YEAR, 2000);
        int year1 = calendar.get(Calendar.YEAR);
        System.out.println("year1 = " +year1);

        calendar.add(Calendar.YEAR, -1);
        int year2 = calendar.get(Calendar.YEAR);
        System.out.println("year2 = " + year2);

        Date date = calendar.getTime();
        System.out.println("date = " + date);
    }
}

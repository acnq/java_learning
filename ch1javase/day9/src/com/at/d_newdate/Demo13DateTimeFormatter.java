package com.at.d_newdate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Demo13DateTimeFormatter {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String format = dtf.format(localDateTime);
        System.out.println(format);

        System.out.println("=====================");

        String time = "2000-10-10 10:10:10";
        TemporalAccessor temporalAccessor = dtf.parse(time);
        System.out.println(temporalAccessor);

        LocalDateTime localDateTime1 = LocalDateTime.from(temporalAccessor);
        System.out.println("localDateTime1 = " + localDateTime1);
    }
}

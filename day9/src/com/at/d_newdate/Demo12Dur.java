package com.at.d_newdate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Demo12Dur {
    public static void main(String[] args) {
        LocalDateTime local1 = LocalDateTime.of(2023, 10, 10, 10, 10, 10);
        LocalDateTime local2 = LocalDateTime.of(2024, 11, 11, 11, 11, 11);
        Duration dur = Duration.between(local1, local2);

        System.out.println(dur.toDays());
        System.out.println(dur.toHours());
        System.out.println(dur.toMinutes());
        System.out.println(dur.toMillis()); // 获取相差的毫秒数字
    }
}

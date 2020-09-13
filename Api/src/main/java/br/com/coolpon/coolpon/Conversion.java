package br.com.coolpon.coolpon;

import java.time.LocalDateTime;

public class Conversion {

    public static String dataConversion(LocalDateTime localDateTime){
        return String.format("%d-%d-%d %d:%d:%d",
                localDateTime.getYear(),localDateTime.getMonth().getValue(),localDateTime.getDayOfMonth(),localDateTime.getHour(),
                localDateTime.getMinute(),localDateTime.getSecond());
    }
}

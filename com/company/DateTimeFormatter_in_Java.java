package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_in_Java {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df =DateTimeFormatter.ofPattern("dd:MM:yyyy --E d:s");
        DateTimeFormatter df2=DateTimeFormatter.ISO_LOCAL_DATE;
        String date =dt.format(df);
        System.out.println(date);
    }
}

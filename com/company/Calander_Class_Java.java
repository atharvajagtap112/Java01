package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class Calander_Class_Java {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
    }
}

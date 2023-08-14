package com.company;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Ad_Practice_Set {
    public static void main(String[] args) {
        //PS Q5
        HashSet<Integer> a =new HashSet<>();
        a.add(44);
        a.add(6);
        a.add(4);
        a.add(3);
        a.add(7);
        a.add(6);
        System.out.println(a);
        //Q3
        Date d =new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
       LocalDateTime s=LocalDateTime.now();
        System.out.println(s);

        DateTimeFormatter df=DateTimeFormatter.ISO_LOCAL_DATE;
        String w=s.format(df);
        System.out.println(w);

    }
}

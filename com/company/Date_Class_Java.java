package com.company;
import java.util.Date;

public class Date_Class_Java {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getDate());
        System.out.println(d.getTime());
        System.out.println(d.getYear()+1900);

    }
}

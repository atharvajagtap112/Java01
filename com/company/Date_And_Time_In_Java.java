package com.company;



public class Date_And_Time_In_Java {
    public static void main(String[] args) {
        //milisec/1000==sec
        //milisec/1000/3600==min
        //milisec/1000/3600/24==hr
        //milisec/365==days
        //milisec/1000/3600/24/365==year
        System.out.println("Years From Since 1970");
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);//From Since 1970

    }
}

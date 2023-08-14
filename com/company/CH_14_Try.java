package com.company;

public class CH_14_Try {
    public static void main(String[] args) {
        int a=1000;
        int b=0;
        int c;
        try {
            c = a / b;
            System.out.println("The result is "+c);
        }
        catch (Exception e){
            System.out.println("We are facing problem ");
            System.out.println(e);
        }
    }
}

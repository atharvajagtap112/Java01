package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return toString()+"This is String ";
    }

    @Override
    public String getMessage() {
        return getMessage()+"This is Message";
    }
}

public class CH_14_Exception_Class {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        if (a<9){
            try {
              //  throw new MyException();
                throw new ArithmeticException("This is an exception");
            }
        catch (Exception e){
            System.out.println(e.getMessage());
           // System.out.println(e.toString());
            System.out.println(e);
    e.printStackTrace();
        }
            System.out.println("Finish");
        }
    }
}

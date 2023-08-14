package com.company;

import java.util.Scanner;

public class CH_14_Nested_Try_Catch {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 12;
        marks[1] = 55;
        marks[2] = 47;
        Scanner sc = new Scanner(System.in);


        boolean flag = true;
        while (flag) {
            System.out.println("Enter The Array Index");
           int ind = sc.nextInt();
            try {
                System.out.println("Welcome to program");
                try {
                    System.out.println("The array is " + marks[ind]);
                    flag=false;




                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Thsi is level 2 " + e);
                }
            } catch (Exception e) {
                System.out.println("This is level 1");
            }
            System.out.println("Thanks ");
        }

    }
}
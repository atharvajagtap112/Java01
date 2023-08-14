package com.company;

import java.util.Scanner;

public class CH_14_Exception_in_java {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 12;
        marks[1] = 55;
        marks[2] = 47;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Index");
        int ind = sc.nextInt();
        System.out.println("Enter the number to divide");
        int number = sc.nextInt();
        try {
            System.out.println("The marks you enter is " + marks[ind]);
            System.out.println("marks/number is " + marks[ind] / number);
        }

        catch (ArithmeticException d) {
            System.out.println("Arithmetic Exception Occur");
            System.out.println(d);
        }
        catch (ArrayIndexOutOfBoundsException s) {
            System.out.println("ArrayIndexOutOfBounds Exception occur");
            System.out.println(s);
        }
        catch (Exception e) {
            System.out.println("Other exception occur");
            System.out.println(e);
        }
    }
}
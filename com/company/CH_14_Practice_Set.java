package com.company;

import java.util.Scanner;

public class CH_14_Practice_Set {
    public static void main(String[] args) {
        /*int a=5;
        int b=0;
        try {
            int c=a/b;
        }
        catch (ArithmeticException g)
        {
            System.out.println("HA HA");
        }
  catch (IllegalArgumentException f){
      System.out.println("HeHe");
  }
   catch (Exception e){
       System.out.println(e);
   }*/
        int[] Marks = new int[3];
        Marks[0] = 44;
        Marks[1] = 55;
        Marks[2] = 22;
        Scanner sc = new Scanner(System.in);

        int a = 0;
        while (true&&a<5) {
            a++;
            try {
                int c = sc.nextInt();
                int mark = Marks[c];
                System.out.println(mark);
                break;
            }
            catch (Exception e) {

                System.out.println("Invalid");
            }
           if (a>=5){
               System.out.println("Error");
           }

        }
    }
}
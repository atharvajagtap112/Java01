package com.company;

public class CH_14_Finally_Block {
   public static int greet(){
       try {
           int a=3;
           int b=0;
           int c=a/b;
           return c;
       }
       catch (Exception e){
           System.out.println(e);
       }
       finally {
           System.out.println("I am finally");
       }
return 0;

   }
    public static void main(String[] args) {
    int k=greet();
        System.out.println(k);
        int x=44;
        int y=9;
   while (true){
       try {
           int g=x/y;
       }
       catch (Exception e){
           System.out.println(e);
           break;
       }
   finally {
           System.out.println("I am finalist "+y);

       }
y--;
   }


    }

}

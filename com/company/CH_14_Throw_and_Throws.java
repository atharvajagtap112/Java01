package com.company;
class negativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius Negative Exception";
    }

    @Override
    public String getMessage() {
        return "Radius Negative Exception";
    }
}
public class CH_14_Throw_and_Throws {
   public static double area(int r) throws negativeRadiusException
   {
   if (r<0){
       throw new negativeRadiusException();

   }
      double solution=Math.PI*r*r;
       return solution;

   }
    public static int divide(int a ,int b) throws ArithmeticException
    {
        int result =a%b;
        return result;
    }
    public static void main(String[] args) {

  try {
      int c =divide(4,0);
      System.out.println(c);
  }
  catch (Exception e){
      System.out.println("Exception");
  }
try {
    double f=area(-4);
    System.out.println(f);
}
catch (Exception e){
    System.out.println(e.toString());
}

    }
}

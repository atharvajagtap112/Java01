package com.company;
class Divide_Exception extends Exception{
    @Override
    public String toString() {
        return "You cannot divide by zero";

    }

    @Override
    public String getMessage() {
        return "You cannot divide by zero";
    }
}
    class MaxException extends Exception{
        @Override
        public String toString() {
           return  "you cannot Enter number greater than 100000";
        }

        @Override
        public String getMessage() {
            return "you cannot Enter number greater than 100000";
        }
    }
class MulException extends Exception{
    @Override
    public String toString() {
        return "You cannot enter multiplication input greater than 7000";
    }

    @Override
    public String getMessage() {
        return "You cannot enter multiplication input greater than 7000";
    }
}


public class CH_14_Excercise_7 {
    public static int add(int a, int b) throws MaxException {
       if(a<10000&&b<10000){
           int i = a + b;
           return i;
       }

        if (a > 10000 || b > 10000) {
            try {
                throw new MaxException();

            } catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }
        }


return 0;

    }

    public static int sub(int a, int b) throws MaxException {
        if(a<10000&&b<10000){
            int i = a - b;;
            return i;
        }

        if (a > 10000 || b > 10000) {
            try {
                throw new MaxException();

            } catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }
        }


        return 0;

    }

    public static int div(int a, int b) throws Divide_Exception, MaxException {
        if (a < 10000&& b < 10000) {
            int i =a%b;

        }
        if (a > 10000 || b > 10000  ) {
           try {

                throw new MaxException();

            } catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }
       if (a <= 0 || b <= 0){
           try {
               throw new Divide_Exception();
           }
           /*catch (ArithmeticException e){
               System.out.println( e+"You cannot divid number by 0");*/

           catch (Divide_Exception p){
               System.out.println(p.getMessage());
               System.out.println(p.toString());
           }

       }

        }
return 0;
    }

    public static int mul(int a, int b) throws MulException {
        if (a < 7000 && b < 7000) {
            int i = a * b;
            return i;
        }
        if (a > 7000 || b > 7000) {
            try {

                throw new MulException();

            } catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }

        }
return 0;
    }

        public static void main(String[] args){

            try {System.out.println("Addition is");
                int c = add(5, 100000000);
                System.out.println(c);
            }
            catch (Exception e) {
                System.out.println(e);
            }

            try {System.out.println("Subtraction is");
                int c = sub(4,6);
                System.out.println(c);
            }
            catch (Exception e) {
                System.out.println(e);
            }
            try {
                System.out.println("dividation is is");
                int c =div(4,0);
                System.out.println(c);
            }
            catch (Exception e){
                System.out.println(e);
            }


            try {
                System.out.println("Multiplication is");
                int c =mul(4,8);
                System.out.println(c);
            }
            catch (Exception e) {
                System.out.println(e);
            }
    }


    }
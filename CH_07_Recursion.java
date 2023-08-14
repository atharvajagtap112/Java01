public class CH_07_Recursion {
    static int factorial(int n){
       if (n==0 || n==1){
           return 1;

       }
        else
            return n*factorial(n-1);
    }
    static int factorial_iterative(int a) {
        if (a == 0 || a == 1) {
            return 1;

        } else {
            int product = 1;
            for (int i = 1; i <= a; i++) {
                product *= i;
            }

            return product;


        }
    }

    public static void main(String[] args) {



        int x=5;
        System.out.println("The factorial is "+ factorial(x));
        System.out.println("The factorial is "+ factorial_iterative(x));










    }



}

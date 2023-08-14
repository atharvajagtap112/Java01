public class CH_07_PRACTICE_SET {
    //problem 1 table
    /*
    static void table(int a){
        for (int i=1;i<=10;i++){

            System.out.printf("%d x %d =%d \n",i,a,a*i);
        }
}
*/
    //Problem 2 Pattern
   /* static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j=0;j<i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }*/
// Sum of the natural number using recursion
    // pattern1_rec(3)
    // pattern1_rec(2) + 3 times star and new line
    // pattern1_rec(1) + 2 times star and new line + 3 times star and new line
    // pattern1_rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line


    // sum(n) = 1 + 2 + 3... + n
    // sum(n) = 1 + 2 + 3... + n-1 + n
    // sum(n) = sum(n-1) + n
    // sum(3) = 3 + sum(2)
    // sum(3) = 3 + 2 + sum(1)
    // sum(3) = 3 + 2 + 1
    static int sumRec(int n){
        if (n==1){
            return 1;
        }

            return n+sumRec(n-1);
    }
    static void pattern2(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j>n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
// recursion using fibonachi sereis
    static int fib(int n){
        if (n==1||n==2){
            return n-1;
        }
   else {
       return fib(n-1)+fib(n-2);
        }

    }
// average os arguments of arry
    static int avg(int...arr){
if (arr.length==1){
    return 1;
}
       else {
    int sum = 0;
    for (int element : arr) {
        sum = sum+element;

    }
return sum/ arr.length;
}

    }
static void pattern1_rec(int n) {
    if (n > 0) {
        pattern1_rec(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print("*");


        }
        System.out.println();
    }
}




    public static void main(String[] args) {
      //problem 1
        // int b=2;
        //      table(b);
//problem2
        //pattern1(4);
//Problem 3
//int c=sumRec(5);
  //      System.out.println(c);

    //Problem 4
        //int a=5;
        //pattern2(a);
        //problem 5
       // int a=fib(5);
        //System.out.println(a);
    //Problem 6
       // System.out.println(avg(4,5,6));

//problem7
       // pattern1_rec(5);
         // Calcies to faranite
        float cal=3f;
        System.out.println((cal* 9/5) + 32 +" °F" );






    }
}

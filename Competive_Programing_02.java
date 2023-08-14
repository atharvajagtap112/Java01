import java.util.Scanner;

public class Competive_Programing_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int sum= A.length()+B.length();
        System.out.println(sum);
        int comperision =A.compareTo(B);
        if (comperision>0){
            System.out.println("yes");
        }
else {
            System.out.println("no");
        }
        String case1=A.substring(0 ,1).toUpperCase()+A.substring(1);
        String case2=B.substring(0 ,1).toUpperCase()+B.substring(1);
        System.out.println(case1+" "+ case2);


// 2
/*import java.util.Scanner;

        public class Solution {

            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int i = scan.nextInt();
                double d =scan.nextDouble();
                String s= scan.next();


                System.out.println("String: " + s);
                System.out.println("Double: " + d);
                System.out.println("Int: " + i);



            }
        }

*/

    }

}

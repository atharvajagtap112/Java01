
import java.util.Scanner;

public class CH_04_PRACTICE_SET {

    public static void main(String[] args) {
      /* byte m1, m2, m3;

        System.out.println("Enter Your Marks");

        System.out.println("Enter Your Englsih Marks");
        m1  = sc.nextByte();
        System.out.println("Enter Your Physics Marks");
        m2 = sc.nextByte();

        System.out.println("Enter Your Chemistry Marks");
        m3 = sc.nextByte();
         float avg=(m1+m2+m3)/3.0f ;
         if (avg>=40&&m1>=33&&m2>=33&&m3>=33)
        {
            System.out.println("Cnogratulation You are passed");
        }
         else{
            System.out.println("You are fail");
        }
*/
      /*  System.out.println("Enter the day");
        S
        int day= sc.nextInt();
        switch (day) {
            case 1-> System.out.println("monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Staurday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("no day");

        }
        System.out.println("Thanks");

*/

     /*
int year= sc.nextInt();
if (year%4==0) {
    System.out.println("leap year");
}
else
        {
            System.out.println("Not leap year");
        }
*/
        System.out.println("Enter the name of websites");
        Scanner sc = new Scanner(System.in);
String sites = sc.next();
if (sites.endsWith(".com")) {
    System.out.println("Comercial Websites");
}
else if (sites.endsWith(".org")) {
    System.out.println("Organisation websites");

}

else if (sites.endsWith(".in")) {
    System.out.println("Indian Websites");

}



    }
}

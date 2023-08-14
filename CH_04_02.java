
import java.util.Scanner;



public class CH_04_02 {

    public static void main(String[] args) {
 /*       System.out.println("Enter your age");
Scanner sc = new Scanner(System.in);

int age = sc.nextInt();
if (age >56) {
    System.out.println("You are experience");
}
else if (age>46)
{
            System.out.println("You are semi experience");
        }

else if (age>36)
{
    System.out.println("You are semi-semi experience");
}

else
{
    System.out.println("You are not experience");
}
*/
/*
int age = 58;
 switch (age) {
     case 18 :
         System.out.println("You are going to become adult");
         break;
     case 23:
         System.out.println("You are getting a job");
             break;
     case 68:
         System.out.println("You are getting a retier");
         break;
     default:
         System.out.println("Enjoy your life");
 }
        System.out.println("thanks");
*/
      /*  char var = 'r';
        switch (var) {
            case 'r' :
                System.out.println("You are going to become adult");
                break;
            case 'g':
                System.out.println("You are getting a job");
                break;
            case 'h':
                System.out.println("You are getting a retier");
                break;
            default:
                System.out.println("Enjoy your life");
        }
        System.out.println("thanks");

*/
        String name = "Atharva";
        switch (name) {
            case "Atharva" -> System.out.println("You are going to become adult");
            case "Harry" -> System.out.println("You are getting a job");
            case "Shubham" -> System.out.println("You are getting a retier");
            default -> System.out.println("Enjoy your life");
        }
        System.out.println("thanks");














    }
}

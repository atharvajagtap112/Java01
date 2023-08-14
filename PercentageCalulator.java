
import java.util.Scanner;
public class PercentageCalulator {


    public static void main(String[] args) {
        System.out.println("Taking Percentage From User");
Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of English");
        float a = sc.nextFloat();
        System.out.println("Enter the Marks of Maths");
      float b= sc.nextFloat();
        System.out.println("Enter the Marks of Physics");
        float c = sc.nextFloat();
        System.out.println("Enter the Marks of Chemistry");
         float d = sc.nextFloat();
        System.out.println("Enter the Marks of Geography");

         float f= sc.nextFloat();


         System.out.println("Enter the Marks of IT");
           float e = sc.nextFloat();
           float sum = a+b+c+d+e + f;
        System.out.println("The sum is ");
        System.out.println(sum);
          float div = sum/600;
          float mul = div * 100;
        System.out.println("the Percentage is ");
        System.out.println(mul);






































    }
    }
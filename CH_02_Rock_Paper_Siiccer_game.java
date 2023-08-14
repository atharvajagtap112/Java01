
import java.util.Scanner;
import java.util.Random;
public class CH_02_Rock_Paper_Siiccer_game {
    public static void main(String[] args) {
        System.out.println("0=Rock and 1=Paper and 2=Scissor");
        Scanner sc=new Scanner(System.in);
        int user= sc.nextInt();
        Random rc=new Random();
        int computer= rc.nextInt(3);
        System.out.println(computer);
        if (user==0&&computer==1){
            System.out.println("Computer Won.....!");
            System.out.println("Computer paper");

        }

        else if (user==0&&computer==2) {
            System.out.println("Congratulation You Won....!");
            System.out.println("Computer Scissor");
        } else if (user==1&&computer==0) {
            System.out.println("Congratulation You Won....!");
            System.out.println("Computer Rock");

        }

        else if (user==1&&computer==2) {
            System.out.println("Computer Won...!");
            System.out.println("Computer Scissor");

        } else if (user==2&&computer==0) {
            System.out.println("Computer Won");
            System.out.println("Computer Rock");
        }
        else if (user==2&&computer==1) {
            System.out.println("Congartulation You Won...!");
            System.out.println("Computer Paper");
        } else if (user==computer) {
            System.out.println("Tie");
        }



    }

}

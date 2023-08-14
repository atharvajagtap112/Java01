import java.util.Random;
import java.util.Scanner;
class GuessTheNumber {

    Random guess = new Random();
   Scanner sc=new Scanner(System.in);
    int userInput;
    int computerInput = guess.nextInt(100);
    boolean isCorrect = false;

    public GuessTheNumber() {
        while (!isCorrect) {
            System.out.println("Enter Your Number:");
userInput= sc.nextInt();
            if (userInput > computerInput) {
                System.out.println("Your Number is Greater"+userInput);

            } else if (userInput < computerInput)

            {
                System.out.println("Your Number Is Smaller"+userInput);

            }
            else if (userInput==computerInput) {
                isCorrect=true;
                System.out.println("Your number is correct "+userInput);
            }
        }
        }

    }


    public class CH_09_Guess_Number {
        public static void main(String[] args) {
//Random guess=new Random();
//int computer =guess.nextInt(100);
            GuessTheNumber user = new GuessTheNumber();
            //System.out.println(user.computerInput);

            //Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your Number");

        }
}


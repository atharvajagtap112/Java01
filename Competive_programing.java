import java.util.Scanner;
public class Competive_programing {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Number ");
        int num = sc.nextInt();
        if(num%2!=0){
            System.out.println("Weird");

        }
        else if (num%2==0&&num>=2&&num<=5) {
            System.out.println("Not Weird");
        }
        else if (num%2==0&&num>=6&&num<=20) {
            System.out.println("Weird");
        } else if (num%2==0&&num>=20) {
            System.out.println("Not Weird");
        }
    }
}

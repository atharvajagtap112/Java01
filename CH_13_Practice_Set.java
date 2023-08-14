
class welcome extends Thread{
    public void run(){
       while (true){
            System.out.println("Good Morning");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class welcome1 extends Thread{
    public void run(){
     /*   while (true){
            System.out.println("Welcome");

        }*/
    }
}
public class CH_13_Practice_Set {
    public static void main(String[] args) {
welcome a1 =new welcome();
welcome1 a2 =new welcome1();
a1.setPriority(6);
a2.setPriority(9);
        System.out.println(a1.getPriority());
        System.out.println(a2.getPriority());
        System.out.println(a2.getState());
//a1.start();
a2.start();
        System.out.println(a2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}

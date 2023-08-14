class MyRunnable1 implements Runnable{
    public void run(){

   while (true) {
       System.out.println("I am Thread in MyRunnable1");
   }
    }
}
class MyRunnable2 implements Runnable{
    public void run(){

        while (true) {
            System.out.println("I am Thread in MyRunnable2");
        }
    }
}
public class CH_13_Runnable {
    public static void main(String[] args) {
        MyRunnable1 Bullet1 =new MyRunnable1();
        Thread gun1 =new Thread(Bullet1);
        MyRunnable2 Bullet2= new MyRunnable2();
        Thread gun2 = new Thread(Bullet2);
        gun1.start();
        gun2.start();
    }
}

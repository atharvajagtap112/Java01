
class MytheThr1 extends Thread{


    public void run(){
        int i=0;
        while (true){
            System.out.println("Thread" );
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MytheThr2 extends Thread{


    public void run(){
        int a=0;
        while (true){
            System.out.println("My Thread.............." );

        }
    }
}
public class CH_13_Thread_Methods {
    public static void main(String[] args) {
        MytheThr1 t1 =new MytheThr1();
        MytheThr2 t2 =new MytheThr2();
        t1.start();
        /*try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
*/

        t2.start();

    }
}

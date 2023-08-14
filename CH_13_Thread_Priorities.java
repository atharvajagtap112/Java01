
class MyThr1 extends Thread{


public MyThr1 (String name )
        {
        super(name);


        }

public void run(){
        int i=33;
        while (true){
    System.out.println("This is "+this.getName() );
        }
        }
        }
public class CH_13_Thread_Priorities {
    public static void main(String[] args) {
MyThr1 t1 =new MyThr1("Atharva1(I am important)");
MyThr1 t2 =new MyThr1("Atharva2");
MyThr1 t3 =new MyThr1("Atharva3");
MyThr1 t4 =new MyThr1("Atharva4");
MyThr1 t5 =new MyThr1("Atharva5");
t1.setPriority(Thread.MAX_PRIORITY);
t2.start();
t3.start();
t4.setPriority(Thread.MIN_PRIORITY);
t5.start();

t1.start();
t4.start();
    }
}

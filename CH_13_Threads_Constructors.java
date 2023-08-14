class MyThr extends Thread{


    public MyThr (String name )
    {
super(name);


    }

    public void run(){
        int i=33;
       
    }
}
public class CH_13_Threads_Constructors {
    public static void main(String[] args) {
        MyThr t1 =new MyThr("Atharva");
        MyThr t2 =new MyThr("Vedant");
        t1.start();
        t2.start();
        System.out.println("I am t1 my name is "+t1.getName());
      //System.out.println("t1 id is "+t1.getId);

        System.out.println("I am t1 my name is "+t2.getName());
       // System.out.println("t1 id is "+t2.getId);
    }
}

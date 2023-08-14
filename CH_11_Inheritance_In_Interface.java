
interface MyClass{
    void meth1();
    void meth2();
}
    interface Childclass extends MyClass{
    void meth3();

    void meth4();
}
class outPut implements Childclass{

   public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
    public void meth3(){
        System.out.println("Meth3");
    }
 public    void meth4(){
        System.out.println("Meth4");
    }


}
public class CH_11_Inheritance_In_Interface {
    public static void main(String[] args) {
        outPut aa=new outPut();
        aa.meth1();
        aa.meth2();
        aa.meth3();
        aa.meth4();
    }
}

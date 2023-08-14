
class A{
    public int meth1(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am a method of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am a method of class B");
    }
    public void meth3(){
        System.out.println("I am a meth3 of class B");
    }

}
public class CH_10_Methods_Overriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth2();
B b=new B();
b.meth2();
    }
}

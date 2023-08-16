package com.company;
@FunctionalInterface
interface demoAnno{
    void meth1();
    //void meth2();
}
/*class Annodemo implements demoAnno{


    @Override
    public void meth1() {

    }

    @Override
    public void meth2() {

    }
}*/
public class Java_Anonymous_Classes_And_Lambda_Expressions {
    public static void main(String[] args) {
     //  Annodemo obj =new Annodemo(); //OR
        // demoAnno obj =new Annodemo();
       // obj.meth1();
demoAnno obj=new demoAnno() { //We Can Write use interface or own class
    @Override
    public void meth1() {
        System.out.println("I am meth1");
    }

   // @Override
    public void meth2() {
        System.out.println("I am meth2");
    }
};
//obj.meth1();
        // Lamda Expressions
        demoAnno obj1=()->{
            System.out.println("I am meth 1 From Lamda Expression");
        };
        obj1.meth1();
    }
}

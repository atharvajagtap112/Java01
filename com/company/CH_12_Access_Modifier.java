package com.company;
class access{
    public int a=5;
    protected int b= 45;
    int c=22;
    private int d=33;
    void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}
public class CH_12_Access_Modifier {
    public static void main(String[] args) {
 access a=new access();
 a.meth1();
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);
       // System.out.println(a.d);
    }
}

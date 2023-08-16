package com.company;
//Q2
class MyDeprecated{

    @Deprecated
    void meth1(){
        System.out.println(" i am deprecated");
    }
}
//Q4
interface myInt{
    void Display();
}
public class Advance_Java_2_Practice_Set {
    public static void main(String[] args) {
MyDeprecated obj =new MyDeprecated();
obj.meth1();
myInt i=()-> {
    System.out.println("I am Display");
};
    }
}

package com.company;
@FunctionalInterface
interface thisfunction{
   // void ThisMethod();
    void ThisMethod1();


}
class phone { //suppose it is store in another file
    public void showTime(){
        System.out.println("TIme is 8 pm");
    }


    }


class newPhone extends phone {
    @Override // <----is Annotation
    public void showTime() {
        System.out.println("Time is 8 am");
    }
    @Deprecated
    public int sum(int a,int b){
        return a+b;
    }
}



public class Annotation_Java {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
newPhone phone =new newPhone();
phone.showTime();
phone.sum(5,6);

    }
}

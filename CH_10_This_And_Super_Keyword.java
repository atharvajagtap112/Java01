class EkClass{
    int a;
    EkClass(int a){
        this.a=a;// While using this we can use same variable also
    }

    public int getA() {
        return a;
    }
}
class Derived2 extends EkClass {
    Derived2(int a){
        super(a);
        System.out.println("I am a constructor"+ a);

    }


}






public class CH_10_This_And_Super_Keyword {
    public static void main(String[] args) {
        EkClass aa=new EkClass(55);
        System.out.println(aa.getA());
Derived2 bb=new Derived2(44);


    }

}


interface MyCamera{
    void snap();
    void takeVideo();
   private void Greet(){
       System.out.println("Welcome");
   }
    default void Take4kVideo(){
       Greet();
       System.out.println("Taking 4K Video");
    }
}
interface wifi{
    String [] takeNetwork();
}
class MycelPhone{
    void call(){
        System.out.println("calling");

    }
}
class MySmartPhone extends MycelPhone implements MyCamera,wifi{
    public void snap(){
        System.out.println("Taking Snap");
    }
    public void takeVideo(){
        System.out.println("taking Video");
    }
    public String[] takeNetwork(){
        System.out.println("Checking wifi");
        String[] Network={"TpLink", "Atharva", "wifi001", "TpLink00"};
                return Network;}
      // public void Take4kVideo(){
        //    System.out.println("4K");

        }



public class CH_11_Interferances_and_Default_Methods {
    public static void main(String[] args) {
MySmartPhone aa =new MySmartPhone();
String[] ms =aa.takeNetwork();
for (String bb: aa.takeNetwork()){
    System.out.println(bb);
}
aa.Take4kVideo();
    }
}

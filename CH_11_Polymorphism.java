
interface MyCamera2{
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
interface wifi2{
    String [] takeNetwork();
}
class MycelPhone2{
    void call(){
        System.out.println("calling");

    }
}
class MySmartPhone2 extends MycelPhone2 implements MyCamera2,wifi2 {
    public void snap() {
        System.out.println("Taking Snap");
    }

    public void takeVideo() {
        System.out.println("taking Video");
    }

    public String[] takeNetwork() {
        System.out.println("Checking wifi");
        String[] Network = {"TpLink", "Atharva", "wifi001", "TpLink00"};
        return Network;
    }

    public void Take4kVideo() {
        System.out.println("4K");

    }
}

    public class CH_11_Polymorphism {
        public static void main(String[] args) {
MyCamera2 cam =new MySmartPhone2();
cam.snap();
cam.Take4kVideo();
wifi2 wi=new MySmartPhone2();
String [] bd=wi.takeNetwork();
for (String gg:bd){
    System.out.println(gg);
}
        }
    }

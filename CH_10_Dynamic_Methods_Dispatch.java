class phone{
    public void ShowTime(){
        System.out.println("Time is 8 am");
    }
public void on(){
    System.out.println("Turning on phone");
}
}
class smartPhone extends phone{
    @Override
    public void on(){
        System.out.println("Turning on smartPhone");
    }
public void music(){
    System.out.println("Playing Music");
}


}



public class CH_10_Dynamic_Methods_Dispatch {
    public static void main(String[] args) {
       // phone obj=new phone();
        //smartPhone obj2=new smartPhone();
        //obj.greet();
phone obj=new smartPhone();//<------superclass==Subclass//Runtime

obj.on();//Allowed
obj.ShowTime();//Allowed
//obj.music; not Allowed



    }
}

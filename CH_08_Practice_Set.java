
class Employe{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }public void setName(String n){
      name=n;
    }
}

//Problem 2 class cellphone
class cellPhone {
    public void ringing() {
        System.out.println("Ringing");
    }

    public void Vibrating() {
        System.out.println("vibrating");
    }
}
//Problem 3
class square{
    int side;
    public void area(){
        System.out.println(side*side);
    }
    public void perimeter(){
        System.out.println(4*side);
    }
}
//Problrm 4
class TommyVecetti{

    public String hittting(){
        return "hitting";
    }
    public String running(){
        return "running";
    }
    public String fireing(){
        return "fireing";
    }






}



public class CH_08_Practice_Set {
    public static void main(String[] args) {
/*Employe atharva=new Employe();
atharva.setName("Heyatharva");
        System.out.println(atharva.getName());
atharva.salary=350000;
        System.out.println(atharva.getSalary());
cellPhone apple=new cellPhone();
apple.ringing();
apple.Vibrating();
*/
        //Problem3
/*square s1=new square();
s1.side=4;
s1.area();
s1.perimeter();
*/
TommyVecetti player=new TommyVecetti();
        System.out.println(player.hittting());
        System.out.println(player.fireing());
        System.out.println(player.running());





    }
}

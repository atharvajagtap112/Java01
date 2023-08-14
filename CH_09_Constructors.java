
class mainMyEmployee{
    private int id;
    private String name;
public mainMyEmployee() {
    id = 0;    //We Can Do Uncomments Also
    name = "Your_Name_Here";
}
 public mainMyEmployee(String MyName,int MyId) {
    name = MyName;
     id =MyId;
 }
 public mainMyEmployee(String MyName) {
    name = MyName;
     id =1;
 }
public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n; //or name=n
    }
    public int getId(){
        return id;
    }
    public void setId(int x){
        id =x;
    }

}
public class CH_09_Constructors {
    public static void main(String[] args) {
//mainMyEmployee atharva=new mainMyEmployee("Your name",888);
//mainMyEmployee atharva=new mainMyEmployee();
mainMyEmployee atharva=new mainMyEmployee("Atharva");
//atharva.setName("Atharva");
//atharva.setId(777);
        System.out.println(atharva.getId());
        System.out.println(atharva.getName());


    }
}

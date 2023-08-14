


class MyEmployee{
    private int id;
    private String name;
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
public class CH_09_access_modifiers {
    public static void main(String[] args) {
MyEmployee atharva=new MyEmployee();
//atharva.id  Throws an error due to private
atharva.setName("Atharva");
        System.out.println(atharva.getName());
        atharva.setId(555);
        System.out.println(atharva.getId());



    }
}

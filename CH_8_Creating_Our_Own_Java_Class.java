
class Employee{
    int id;
    String name;
    int salary;
public void printDetails(){
    System.out.println("My id is "+id);
    System.out.println("My name is "+name);

    }
public int getSalary(){
return salary;
}
}


public class CH_8_Creating_Our_Own_Java_Class {
    public static void main(String[] args) {
Employee atharva=new Employee();// Instantiating a new Employee Object
Employee harry=new Employee();// Instantiating a new Employee Object
// Setting Attributes for atharva
atharva.id=7;
atharva.name="heyatharva";
atharva.salary=35;
// Setting Attributes for Harry
harry.id=12;
harry.name="heyHarry";
// Printing the Attributes
atharva.printDetails();
harry.printDetails();
int salary= atharva.getSalary();
        System.out.println(salary);
//System.out.println(atharva.id);
//System.out.println(atharva.name);

    }
}

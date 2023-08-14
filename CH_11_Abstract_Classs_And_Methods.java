abstract class parent1{
    parent1(){
        System.out.println("I am construtor");
    }
abstract public void greet();

}
class child1 extends parent1{
    @Override
    public void greet(){

        System.out.println(" A very good morning");
    }
}
abstract class child2 extends parent1{
    public void hello(){
        System.out.println("Hello...!");
    }
}






public class CH_11_Abstract_Classs_And_Methods {
    public static void main(String[] args) {
//parent1 p=new parent1();
child1 c1=new child1();
c1.greet();
//child2 c2=new child2();<------Error
    }
}

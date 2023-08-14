
class circle{
    public int radius;
circle(){
    System.out.println("I am non parameter");
}
    public circle(int r) {
        this.radius= r;
        System.out.println("I am parameter of circle");
    }

    public double area(){
        return Math.PI*radius*radius;
    }
public double volume(){
        return 2*Math.PI*radius;
}
}
class cylinder1 extends circle {
    public int height;
  cylinder1(int height,int r) {
      super(r) ;
      System.out.println("I am Parameter of cylinder");
  this.height = height;

    }



public double volume(){
    return Math.PI*radius*radius*height;
}




}



public class CH_10_Problem_Set {
    public static void main(String[] args) {
        //Problem1
    circle c=new circle(5);
   cylinder1 d=new cylinder1(5,5);
      /*System.out.println(c.area());
        System.out.println(c.volume());
      System.out.println(d.volume());*/
    }
}

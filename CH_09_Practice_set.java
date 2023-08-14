class cylinder {
    float radius;
    float height;

    public cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public double area() {

        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public void volume() {
        System.out.println("The volume is " + Math.PI * radius * radius * height);
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(int rd) {
        radius = rd;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(int h) {
        height = h;
    }

}//problem 4
    class rectangle{
        int length;
        int breadth;

    public rectangle() {
        this.length = 4;
        this.breadth =5;
    }

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println(length);
    }

        public int getLength() {
            return length;
        }

        public int getBreadth() {
            return breadth;
        }
    }





public class CH_09_Practice_set {
    public static void main(String[] args) {
//cylinder glass=new cylinder(5,5);
//glass.setRadius(5);
//glass.setHeight(5);
     //  System.out.println(glass.area());
       //glass.volume();
   rectangle a1 =new rectangle(12,14);

        System.out.println(a1.getLength());
        System.out.println(a1.getBreadth());
    }
}

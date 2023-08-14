public class CH_7_Method_Overloading_in_Java {

 static void foo(){
     System.out.println("Good Morning Bro!!");
 }
 static void foo(int a){
     System.out.println("Good Morning "+a+ " Bro");
 }
 static void foo(int a,int b){ //So in this a and b is parameter
     System.out.println("Good Morning "+a+ " Bro");
     System.out.println("Good Morning "+b+ " Bro");
 }





  static void changed(int [] arr){
      arr[0] = 88;
  }

   static void changing(int x){
       x=77;
   }
   static void jock(){
        System.out.println("HA HA HA");
    }

    public static void main(String[] args) {
        //jock();
// Changing The Integer
   /*     int a=44;
        changing(a);   // It will not change it will be only copy in method
        System.out.println("The chnaged integer is "+ a);
// Changing The Array
        int [] marks ={ 55,69,90,99,78,96};
        changed(marks);  // In a case of array it works because in case on marks it store only referance address it make copy in methods same in case of int
        System.out.println("Changing The Array "+marks[0]);
*/
//METHODS OVERLODING IN JAVA
        foo();
foo(300);
foo(300,700); //So in this 300 and 700 is Arguments
        //Arguments are actual
    }
}


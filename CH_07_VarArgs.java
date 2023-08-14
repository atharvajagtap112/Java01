public class CH_07_VarArgs {
//static int sum(int a, int b){
  //  return a+b;
//}
static int sum(int...arr){
    int add =0;
   for (int a:arr){
        add +=a;
    }
    return add;
}
    public static void main(String[] args) {

        System.out.println("The Sum Of a And b Is "+sum(5,2));
        System.out.println("The Sum Of a And b And cIs "+sum(5,5,5));
        System.out.println("The Sum Of a And b And c And d Is "+sum(5,2,2,1));





    }


}

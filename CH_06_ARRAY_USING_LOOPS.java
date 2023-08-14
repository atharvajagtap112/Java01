public class CH_06_ARRAY_USING_LOOPS {
    public static void main(String[] args) {


        int [] marks ={45,96,65,95,85};
      /*  for (int i =0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }*/
   // LOOP IN REVERSE
/*        if (int i =marks.length -1;i>=0;i--)

        {
            System.out.println(marks[i]);
        }
*/
// FOR EACH LOOP
        for (int element:marks)
        {
            System.out.println(element);
        }




    }
}

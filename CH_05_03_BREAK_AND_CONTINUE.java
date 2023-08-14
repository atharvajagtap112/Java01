public class CH_05_03_BREAK_AND_CONTINUE {
    public static void main(String[] args) {
/*
       for (int i=0;i<50;i++){
            System.out.println(i);

           System.out.println("java is great");
       if(i==3)
       {
           System.out.println("Hii");
       break;
       }




       }

*/
// While loop
        /*
        int a=0;
while (a<40)
{
    System.out.println(a);
a++;

if (a==6)
{
    System.out.println("Java");
break;
}
}
*/
/*

int b=0;
do {
    System.out.println(b);
b++;
if (b==16)
{
    System.out.println("You are great");

break;

}


}

while (b<50);
*/

//CONTINUE

     /*   for (int i=0;i<50;i++){

            if(i==3)
            {
                System.out.println("Hii");
                continue;
            }
            System.out.println(i);

            System.out.println("java is great");



        }

*/

// WHILE LOOP ON CONTINUE
        int a=0;
        while (a<40)
        {   a++;


            if (a==6)
            {
                System.out.println("Java");
            continue;
            }

            System.out.println(a);
            System.out.println("Java is great");


        }

























    }
}

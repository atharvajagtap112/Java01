import java.util.Arrays;

public class CH_06_PRACTICE_SET {
    public static void main(String[] args) {
    // sum
     /*   float sum=0;
        float [] marks = new float[5]; //or {4f,6.6f,7.5f,3.6f,5f}
        marks[0]=4f;
        marks[1]=6.8f;
        marks[2]=7f;
        marks[3]=3f;
        marks[4]=5f;
        for (int i=0;i< marks.length;i++)
        sum=sum+marks[i];
        {
            System.out.println(sum);
        }

*/
        // To Find Out Wheter Number Present In Array Or Not
  /*      float [] marks = {45.5f,55.6f,77.5f,99.9f,46.6f};
       float num =45.5f;
       boolean isInArray =false;
for (float element :marks){

    if (num==element){
         isInArray=true;
    }
}
if (isInArray){
    System.out.println("The number is in array");
}
else {
    System.out.println("The number not in array");
}
*/

      /*  float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = (sum + element);
        }
        System.out.println("The value of average is " + sum/5);

*/
// SUM OF THE MATRICE
   /*     int[][] mat1={ {4,5,4},
                       {2,3,1}};

        int[][] mat2={ {2,0,1},
                       {3,2,1}};
        int[][] result={ {0,0,0},
                         {0,0,0}};
for (int i=0;i<mat1.length;i++){
    for (int j=0;j<mat1[i].length;j++){
        result[i][j]=mat1[i][j]+mat2[i][j];
        System.out.print(result[i][j]+" ");

    }

    System.out.println("");



}
*/
    /*    // Practice Problem 4
        int [][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                {0, 0, 0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }
*/
// ARRAY IN REVERSE
/*  int [] arr ={56,85,2,1,0};
  int l = arr.length;
int n=Math.floorDiv(l,2);
int temp;
for (int i=0;i<n;i++){
    temp = arr[i];
    arr[i]=arr[l-i-1];
    arr[l-i-1]=temp;

}
for (int element:arr)
{
    System.out.println(element +" ");
}
*/

        // Practice Problem 5
     /*   int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }

*/
// MAXIMUM VALUE
      /*  int [] arr = {1, 21, 3, 4, 5, 34, 67};
         int max = Integer.MIN_VALUE;

        for (int e :arr)

        {
        if (e>max) {
            max=e;
        }


        }

        System.out.println(max);*/
// MINIMUM VALUE
/*        int [] arr = {1, 21, 3, 444, 5, 34, 67};
  int min = Integer.MAX_VALUE;
  for (int element :arr){
      if (element<min){
          min=element;
      }
  }
        System.out.println(min);*/

        // ARRAY SORTED OR NOT
        int [] arr = {1, 21, 3, 444, 5, 34, 67};  boolean isIn =true;
          for (int i=0;i< arr.length;i++) {
if (arr[i] <arr[i+1]){
isIn=false;
break;
}
}
if (isIn){
    System.out.println("sorted");
}
else {
    System.out.println("not sorted");
}
    }
}
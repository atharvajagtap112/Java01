package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling_Java {
    public static void main(String[] args)
    {
        //Code to create a new file
        File myFile =new File("CWH111.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable To Create File");
            throw new RuntimeException(e);
        }



      // Code to write a file
      /*  try {
            FileWriter fileWriter=new FileWriter("CWH111.txt");
            fileWriter.write("Hi i am Atharva");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File myFile1=new File("CWH111.txt");
        try {
            Scanner sc=new Scanner(myFile1);*/
//while (sc.hasNextLine()){
  //  String line=sc.nextLine();
        //System.out.println(line);
}
        }
/*catch (FileNotFoundException e){
    System.out.println(e);
    e.printStackTrace();
}
// Deleting a file
    File myFile = new File("cwh111file.txt");
        if(myFile.delete()){
        System.out.println("I have deleted: " + myFile.getName());
    }
        else{
        System.out.println("Some problem occurred while deleting the file");
    }

*/
//}
//}

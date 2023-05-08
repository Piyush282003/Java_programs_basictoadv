package com.Piyush;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class C71_File_handling {
    public static void main(String[] args) throws IOException {
//        CODE TO CREATE A NEW FILE:-

        File f=new File("Piyush.txt");
        f.createNewFile();

//        OR
//
//        try{
//            f.createNewFile();
//        }catch (Exception e){
//                e.printStackTrace();
//        }


//        *************************************************************************************************************************************

////        CODE TO WRITE IN A NEW FILE:-
//        FileWriter fw=new FileWriter("Piyush.txt");
//        fw.write("Hi, Sigma males are best so you have to be like that..\nOkay bro..");
//        fw.close();


//        *************************************************************************************************************************************

////        CODE TO READ A FILE:-
//        File f=new File("Piyush.txt");
//        Scanner sc=new Scanner(f);
////        while(sc.hasNextLine()){
////            String l =sc.nextLine();
////            System.out.println(l);
////        }
//        while(sc.hasNext()){
//            String l =sc.next();
//            System.out.print(l+" ");
//        }
//        sc.close();


//        *************************************************************************************************************************************


////        CODE TO DELETE A FILE:-
//        File df=new File("Piyush.txt");
//        if(df.delete()){
//            System.out.println("file is deleted");
//        }
//        else{
//            System.out.println("Some error occured");
//        }
    }
}

package File_Handling;

import java.io.*;

public class F01_FileInputStream {
    public static void main(String[] args) {
        FileInputStream f1=null;
        try{
            f1=new FileInputStream("Piyush.txt");
            int b = 0;
            while((b=f1.read())!=-1){
                System.out.println((char)b);
            }
            f1.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

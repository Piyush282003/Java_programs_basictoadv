package File_Handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class F04_FileReader_FileWriter {
    public static void main(String[] args) throws IOException {
        File f=new File("Girish.txt");
        FileWriter fw=new FileWriter(f);
        String s="Hlo how are you";
        fw.write(s);                                               //isme string ko bytes me convert krne ki zrurt ni pdi...
        fw.close();




        File f1=new File("A.txt");                   //->declare/create a i/p file
        FileReader fr=new FileReader(f1);
        int b;
        while ((b=fr.read())!=-1){                              //read will return in integer/ascii value..and EOF means -1..
            System.out.print((char)b+" ");                        //here we are doing typecasting..
        }
        fr.close();
    }
}

package File_Handling;

import java.io.*;

public class F03_BufferedInput_Output_stream {
    public static void main(String[] args)throws IOException {
        FileOutputStream f = new FileOutputStream("Piyush.txt");
        BufferedOutputStream bf=new BufferedOutputStream(f);

        String s="Piyush Kumar";
        byte []b=s.getBytes();
        bf.write(b);

        bf.close();
        f.close();


        FileInputStream f1=new FileInputStream("A.txt");
        BufferedInputStream bf1=new BufferedInputStream(f1);
        int c;
        while((c=bf1.read())!=-1){
            System.out.print((char)c+" ");
        }

        bf1.close();
        f1.close();
    }
}

package File_Handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class F05_readandwrite_inffile {
    public static void main(String[] args) throws IOException {
        File f1=new File("Girish.txt");
        File f2=new File("B.txt");

//        do file bnao and jisse read krna hai uska FileReader banado or jisme write krana hai usme FileWriter banado...
        FileReader fr=new FileReader(f1);
        FileWriter fw=new FileWriter(f2);

        int ch;
        while((ch=fr.read())!=-1){
            fw.write(ch);
        }

        fr.close();
        fw.close();
    }
}

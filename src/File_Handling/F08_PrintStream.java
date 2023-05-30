package File_Handling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class F08_PrintStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream f=new FileOutputStream("A.txt");
        PrintStream p=new PrintStream(f);
        p.println(400);
        p.println("hlo mr. how are you");
        p.close();
        f.close();
    }
}

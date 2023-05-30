package File_Handling;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class F06_ByteArrayOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream f1=new FileOutputStream("A.txt");
        FileOutputStream f2=new FileOutputStream("B.txt");
        ByteArrayOutputStream b=new ByteArrayOutputStream();
        b.write(452);
        b.writeTo(f1);
        b.writeTo(f2);
        b.flush();
    }
}

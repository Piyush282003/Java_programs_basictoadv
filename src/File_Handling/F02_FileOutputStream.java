package File_Handling;

import java.io.FileOutputStream;
import java.io.IOException;

public class F02_FileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream f1=null;
        f1=new FileOutputStream("A.txt");
//        byte []b={'P','I','Y','U','S','H'};
        String s="abcdefghijkl";
        byte []b=s.getBytes();
        f1.write(b);                               //yeh uss file me overwrite krega...
        f1.close();

    }
}

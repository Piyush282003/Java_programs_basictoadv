package ArraysPrac;

import java.util.StringTokenizer;

public class J04_StringTokenizer {
    public static void main(String[] args) {
        StringTokenizer s =new StringTokenizer("welcome->lloo","l",true);
//        If the flag is false, delimiter characters serve to separate tokens
//        If the flag is true, delimiter characters are considered to be tokens.
        while(s.hasMoreTokens()) {
            System.out.println(s.nextToken());
            //use ""+s.nextToken() to convert in string
        }
    }
}

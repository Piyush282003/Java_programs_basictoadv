package ArraysPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class J27_count_0 {
    public static void main(String[] args) {
        String s="123004050607080";

        ArrayList<Character> c=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            c.add(s.charAt(i));
        }
        System.out.println(c);
        System.out.println(Collections.frequency(c,'0'));
    }
}

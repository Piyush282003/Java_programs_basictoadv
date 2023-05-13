package ArraysPrac;

import java.util.Arrays;

public class J19_remove_duplicates {
    public static String removedup(String s){
        if(s.length()==1){
            return s;
        }
        if(s.charAt(0)==s.charAt(1)){
            return removedup(s.substring(1));
        }
        return s.charAt(0)+removedup(s.substring(1));
    }
    public static void main(String[] args) {
        String s="aaabddcdbcd";
        System.out.println(removedup(s));

    }
}

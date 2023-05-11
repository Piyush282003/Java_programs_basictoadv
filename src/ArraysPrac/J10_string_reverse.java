package ArraysPrac;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class J10_string_reverse {
    public static void main(String[] args) {
        Character ch[]={'a','c','c','b','d'};
        for(Character c:ch){
            System.out.print(c+" ");
        }
        System.out.println();
//        Collections me jo cheez ue uska generic bnake kro...
        Collections.reverse(Arrays.asList(ch));
//        Collections.sort(Arrays.asList(ch),Collections.reverseOrder());

        for(char c:ch){
            System.out.print(c+" ");
        }
        System.out.println();

        StringBuffer sb = new StringBuffer(Arrays.toString(ch));
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }
}

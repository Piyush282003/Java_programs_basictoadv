package ArraysPrac;

import java.util.ArrayList;

public class J31_largenum_div_by7 {
    public static void main(String[] args) {
            // code here
        String num="8955795758";
            int rem=0;
            for(int i=0;i<num.length();i++){
                int digit=rem*10+num.charAt(i)-'0';
                rem=digit%7;         //yha r vo jisse divide krna hai
            }
        System.out.println(rem==0);

    }
}

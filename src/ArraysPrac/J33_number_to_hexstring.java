package ArraysPrac;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class J33_number_to_hexstring {
    static String encryptString(String s){
        // code here
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            int count = 0;
            String hex;

            while (i < s.length() && s.charAt(i) == ch) {

                count++;
                i++;                  //for aaab     isme i ki value 3 hojegi toh agli baar upr jayega toh upr i++ usey 4 krdega toh isliye 0 based indexing isliye i-- krdenge agli line me hum...
            }

            i--;

            hex = Integer.toHexString(count);
            hex=new StringBuilder(hex).reverse().toString();

            ans.append(ch);
            ans.append(hex);
        }

        ans.reverse();

        return ans.toString();
    }
    public static void main(String[] args) {
//        int n=11;
//        System.out.pri?ntln(Integer.toHexString(n));
//        String i=Integer.toHexString(11);
        System.out.println(encryptString("abbc"));
    }
}

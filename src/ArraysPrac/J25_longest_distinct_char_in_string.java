package ArraysPrac;

import java.util.Arrays;

public class J25_longest_distinct_char_in_string {
    static int longestSubstrDistinctChars(String s){
        int maxlen=0,start=-1;
        int a[]=new int[256];
        Arrays.fill(a,-1);
        for(int i=0;i<s.length();i++){
            if(a[s.charAt(i)]>start){
                start=a[s.charAt(i)];
            }
            a[s.charAt(i)]=i;
            maxlen=Math.max(maxlen,i-start);
        }
        return maxlen;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstrDistinctChars("pwwkee"));                 //wke is the ans
    }
}

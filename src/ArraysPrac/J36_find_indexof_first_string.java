package ArraysPrac;

import java.util.EmptyStackException;

public class J36_find_indexof_first_string {
    public static void main(String[] args) {
        String s1="abcdef";
        String s2="cdeg";
        int m=s1.length();
        int n=s2.length();
        if(m<n) System.out.println("Not valid");;

        for(int i=0;i<=m-n;i++){
            int j=0;
            while(j<n && s1.charAt(i+j)==s2.charAt(j)){
                j++;
            }
            if(j==n){
                System.out.println(i);;
            }
        }
        System.out.println("Not present");
    }
}

package ArraysPrac;

import java.util.Scanner;

public class J02_String_to_charArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();


//        String ch[] = s.split("");
//        for(int i=0;i<ch.length;i++){
//            System.out.println("The char is "+ch[i]);
//        }

        String ch[] = s.split(" ");
        for(int i=0;i<ch.length;i++){
            ch[i] = new StringBuffer(ch[i]).reverse().toString();
            System.out.print(ch[i]+" ");
        }

    }
}

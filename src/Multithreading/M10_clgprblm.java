package Multithreading;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class CodingThread implements Runnable{
    Thread t;
    String s;
    CodingThread(String s){
        this.s=s;
        t=new Thread(this);
        t.start();
    }
    public void run(){
        System.out.println(valid(s));
    }
    public boolean valid(String s){
        String ans="";
        boolean b=true;
        String[] c=s.split("[.]");

        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
            int d=Integer.parseInt(c[i]);
            if(d>=0 && d<=255){
                continue;
            }
            else{
                return false;
            }
        }
//        for(int i=0;i<s.length();i++){
//            if()
//            if(s.charAt(i)=='.' || i==s.length()-1){
//                int d=Integer.parseInt(ans);
//                ans="";
//                if(d>0 && d<255){
//                    continue;
//                }
//                else{
//                    return false;
//                }
//            }
//            ans+=s.charAt(i);
//        }


        return b;
    }
}
public class M10_clgprblm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ip address in string");
        String s=sc.nextLine();

        CodingThread c=new CodingThread(s);
    }
}

package com.Piyush;

import java.util.Scanner;

public class C04_stringinput {
    public  static  void main(String[] args){
        System.out.println("Taking input");
        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
        String s = sc.nextLine();
        System.out.println(s);
    }
}

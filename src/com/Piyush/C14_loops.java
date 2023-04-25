package com.Piyush;

import java.util.Scanner;

public class C14_loops {
    public static void main(String[] args) {
        //        using loops in java:
        System.out.println("Enter the range with which you want to print");
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
//        int i=1;
//        while(i<=val){
//            System.out.println(i);
//            i++;
////            i+=2;
//        }

//        for(int i=1;i<=val;i++){
//            System.out.println(i);
//        }


        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=val);


//        while(true){
//            System.out.println("This is awesome and it is used for infinte loops.. ");
//        }
    }
}

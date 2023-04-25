package com.Piyush;

import java.util.Scanner;

public class C12_switchcase {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner num = new Scanner((System.in));
        int age = num.nextInt();

//        switch(age){
//            case 18:
//                System.out.println("You are 18");
//                break;
//            case 23:
//                System.out.println("You can join a job");
//                break;
//            case 68:
//                System.out.println("You are retired");
//                break;
//            default:
//                System.out.println("Enjoy your life..");
//        }





//        agr break use na kre toh uss case se baaki niche ke saare print honge including default wala bhi
        switch(age){
            case 18:
                System.out.println("You are 18");
                break;
            case 23:
                System.out.println("You can join a job");
//                break;
            case 68:
                System.out.println("You are retired");
//                break;
            default:
                System.out.println("Enjoy your life..");
        }





//        -> se break lgane ki zrurt nhi pdhti and called as "enhance switch"...
        switch (age) {
            case 18 -> {
                System.out.println("You are 18");
                System.out.println("You are 18");
                System.out.println("You are 18");

            }
            case 23 -> System.out.println("You can join a job");
            case 68 -> System.out.println("You are retired");
            default -> System.out.println("Enjoy your life..");
        }
    }
}

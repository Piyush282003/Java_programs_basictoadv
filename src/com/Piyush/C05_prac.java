package com.Piyush;

import java.util.Scanner;

public class C05_prac {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

//        Question 1
//        System.out.println("Enter 1st num");
//        int a = sc.nextInt();
//        System.out.println("Enter 2nd num");
//        int b = sc.nextInt();
//        System.out.println("Enter 3rd num");
//        int c = sc.nextInt();
//        System.out.print("The sum of three numbers is ");
//        System.out.println(a+b+c);


//        Question 2
//        float a = sc.nextFloat();
//        float b = sc.nextFloat();
//        float c = sc.nextFloat();
//        float sum = (a+b+c)/30;
//
//        System.out.println(
//                String.format("%.5f",sum));




//        Question 3
//        String s = sc.nextLine();
//        System.out.println("Hello "+ s + " have a good day..");


//        Question 4
//        System.out.println("Enter distance in km");
//        int a = sc.nextInt();
//        a = a*1000;
//        System.out.println("The distance in metres is "+a +"m.");


//        Question 5
        System.out.println("Enter the number");
        boolean b = sc.hasNextInt();
        if(b){
            System.out.println("Yes it is an integer");
        }
        else{
            System.out.println("No it's not an integer");
        }
    }
}

package com.Piyush;

import java.util.Scanner;

public class C03_takeinput {
    public static void main(String[] args){
        System.out.println("Taking input from user bhai...");
        Scanner sc=new Scanner(System.in);                     //yeh ek baar hi likhna hai
        System.out.println("Enter first integer:");
        int a = sc.nextInt();
        System.out.println("Enter second integer:");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.print("The sum of integer a and b is ");
        System.out.println(sum);


        System.out.println("**************************************************************************");

        System.out.println("Enter the float num:");
        float c = sc.nextFloat();
        System.out.println("Enter the float num:");
        float d = sc.nextFloat();

        float sum2=c+d;
        System.out.print("The sum of floating sum is ");
        System.out.println(sum2);


        System.out.println("**************************************************************************");

        System.out.print("Enter the number:- ");
        boolean b1=sc.hasNextInt();
        System.out.println(b1);

    }
}

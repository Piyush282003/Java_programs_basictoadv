package com.Piyush;

import java.util.Scanner;

public class C21_recursion {
        static int factorial(int x){
        if(x==1 || x==0){
            return 1;
        }
        else{
            return x*factorial(x-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number you want the factorial of:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The factorial of a number "+a+" is "+factorial(a));
    }
}

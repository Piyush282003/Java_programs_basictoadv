package com.Piyush;

import java.util.Scanner;

public class C11_ifelse {
    public static void main(String[] args) {
        System.out.print("Enter the age beta: ");
        Scanner num = new Scanner(System.in);
        int age = num.nextInt();

        if(age>18){
            System.out.println("You can drive as you are above 18..");
        }
        else if(age==18){
            System.out.println("You can drive as you age is 18");
        }
        else{
            System.out.println("You cannot drive as you are underage..");
        }
    }
}

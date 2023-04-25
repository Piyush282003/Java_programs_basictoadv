package com.Piyush;

import java.util.Scanner;

public class C50_nested_try {
    public static void main(String[] args) {

        int [] marks = new int[3];
        marks[0]=7;
        marks[1]=67;
        System.out.println(marks[2]);                   //--> 0 aayega coz isme garbage values nhi hoti uski ek alag class hoti hai..

        Scanner sc= new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("Enter the value of index");
            int n = sc.nextInt();
            try {
                System.out.println("Hello");
                try{
                    System.out.println(marks[n]);
                    flag=false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Out of bounds");
                }

            } catch (Exception e) {
                System.out.println("Exception in Level 1");
            }
        }
    }
}

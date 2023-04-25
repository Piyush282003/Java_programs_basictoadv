package com.Piyush;

import java.util.Scanner;

public class C49_handling_specific_exceptions {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int num = sc.nextInt();

        try{
            System.out.println("The value at array index entered is "+marks[ind]);
            System.out.println("The value of array-value/number is "+marks[ind]/num);
        }
        catch(ArithmeticException e){
            System.out.println("Pehla wala catch..");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dusre wala catch..");
        }catch(Exception e){
            System.out.println("Some occured");
        }
    }
}

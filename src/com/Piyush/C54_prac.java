package com.Piyush;

import java.util.Scanner;

public class C54_prac {
    public static void main(String[] args) {
        try{
            int a=666/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("Hehe");
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }




        boolean flag=true;
        int [] marks=new int[3];
        marks[0]=1;
        marks[1]=45;
        marks[2]=56;
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        while(flag && i<5){
            try{
                System.out.println("Enter the value of index");
                index=sc.nextInt();
                System.out.println("The value is "+marks[index]);
                break;
            }catch(Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }
    }
}

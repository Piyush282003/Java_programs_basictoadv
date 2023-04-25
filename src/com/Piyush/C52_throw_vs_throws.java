package com.Piyush;


import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

class NegativeException extends Exception{
    public String toString(){
        return "Radius cannot be negative ";
    }
    public String getMessage(){
        return "Kaha na radius negative nhi ho skta";
    }
}


public class C52_throw_vs_throws {

    public static double area(int r) throws NegativeException{
        if(r<0){
            throw new NegativeException();                   //agr upr throws NegativeException likha hua hai toh yha try catch me krne ki zrurt nhi hai..
        }
        double result=Math.PI*r*r;
        return result;
    }
    public static int divide(int a,int b) throws ArithmeticException{

        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
//        try{
//            int c = divide(600,0);
//            System.out.println(c);
//        }
//        catch (Exception e){
//            System.out.println("Exception occurs...");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        int r = sc.nextInt();

        try{
            double res = area(r);
            System.out.println(res);
        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }
    }
}

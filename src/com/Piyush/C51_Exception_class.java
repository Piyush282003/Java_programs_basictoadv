package com.Piyush;

import java.util.Scanner;

class Myexception extends Exception{
    Myexception(){
        System.out.println("Jaa be");
    }
    Myexception(String name){
        System.out.println("Jaa be "+name);
    }
    @Override
    public String toString(){
//        return super.toString() + " I am toString";
        return "I am toString";
    }
    @Override
    public String getMessage(){
        return super.getMessage() + " I am getMessage";
    }
}
public class C51_Exception_class {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        if(a<9){
            try{
//                System.out.println("Heelloo");
                throw new Myexception("This is an Exception");
//                throw new ArithmeticException("This is an exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);                                 //agr e ho toh toString() wala method run hota hai....
                e.printStackTrace();                                 //yeh red me hoga print or yeh end h bhai ke baad print hoga..
                System.out.println("End h bhai");
            }
            System.out.println("Jaa yr hatle");
        }
    }
}

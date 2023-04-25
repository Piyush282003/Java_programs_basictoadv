package com.Piyush;

public class C02_literals {
    public static void main(String[] args) {
        byte age=34;
        System.out.print("Your age is: ");
        System.out.println(age);
        char ch='A';
        System.out.println(ch);
        float f1=5.6f;                      //by default yeh double leta h toh f lgana pdhta h..
        System.out.println(f1);
        double d=5.67D;
//        double d=5.67d;
        System.out.println(d);
//        long lo=566666666666l;
        long lo=566666666666L;                                 //long ya double ya float ke liye l,d,f lgana pdhta h...
        System.out.println(lo);
        boolean boo=true;
        System.out.println(boo);

        String str="Piyush Kumar";
        System.out.print("My name is ");
        System.out.println(str);
    }
}

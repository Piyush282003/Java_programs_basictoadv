package com.Piyush;

public class C07_operators_precedence {
    public static void main(String[] args) {
        int b=20;
        b+=20;
        System.out.println(b);

        b/=4;
        System.out.println(b);

        b*=2;
        System.out.println(b);

        System.out.println(6==5);
        System.out.println(45>40 && 4>5);
        System.out.println(45>40 || 4>5);

        System.out.println(2 | 3);                        //yeh hote h bitwise operators..


        int a = 6*5-34/2;
        /*
        highest precedence goes to * and /...they are evaluated on the basis of left to right associativity..except in ++,=..
        =30-34/2
        =30-17
        =13
        */
        System.out.println(a);

        int c = 60/5-34*2;
        /*
        =12-34*2
        =12-68
        =-56
        */
        System.out.println(c);


    }
}

package com.Piyush;

import java.util.Scanner;

public class C23_static_nonstatic {
    static int res(int balance){
        int b = balance;
        return b;
    }
    int res1(int balance){
        int c = balance;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = res(a);
        System.out.println("The value of b is "+b);

        C23_static_nonstatic obj = new C23_static_nonstatic();
        int c = obj.res1(a);
        System.out.println("The value of c is "+c);
    }
}

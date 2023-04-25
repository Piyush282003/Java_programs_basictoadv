package com.Piyush;

public class C22_prac_method {
    static void logic(int x){
        for(int i=1;i<=10;i++){
            System.out.println(x+" X "+i+" = "+x*i);
        }
    }
    static void logic2(int x){
        for(int i=0;i<x;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static int sumrec(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sumrec(n-1);
        }
    }
    static void logic3(int x){
        if(x>0){
            logic(x-1);
            for (int i=0;i<x;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        int a=2;
        logic(4);
        logic2(4);
        int c=sumrec(4);
        System.out.println(c);
//        logic3(4);

    }
}

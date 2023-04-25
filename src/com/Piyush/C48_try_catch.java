package com.Piyush;

public class C48_try_catch {
    public static void main(String[] args) {
        int a=56;
        int b=0;
//        int c=a/b;

        try{
            int c=a/b;
        }catch(Exception e){
            System.out.print("We failed to divide. Reason is: ");
            System.out.println(e);
        }

        System.out.println("End");
    }
}

package com.Piyush;

public class C53_finally_block {
    public static int greet(){
        try{
            int a=50;
            int b=10;
            int c=a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("I am finally block that runs even after the return statement....");
        }
        return -1;
    }
    public static void main(String[] args) {
//        eg with return
        int k = greet();
        System.out.println(k);

//        eg with break
        int a=50;
        int b=9;
        while(true){
            try{
                System.out.println(a/b);
            }catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("Jaa yr tune zero ku hone dia");
            }
            b--;
        }
    }
}

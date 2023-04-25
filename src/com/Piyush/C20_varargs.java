package com.Piyush;

public class C20_varargs {
    static int sum(int ...arr){                             //3 dots ko varargs kehte h...toh yaad rkhlo..
//        available as int [] arr;
        int result=0;
        for(int ele:arr){
            result+=ele;
        }
        return result;
    }

    static int sum2(int x,int ...arr){                             //3 dots ko varargs kehte h...toh yaad rkhlo..
//        available as int [] arr;
        int result=x;
        for(int ele:arr){
            result+=ele;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 4 and 5 is: "+sum(4,5));
        System.out.println("The sum of 4 and 5 is: "+sum());               //sum ke andr kuch nhi diya toh 0 print krega voh..
        System.out.println("The sum of 4,5,6 and 7 is: "+sum(4,5,6,7));


        System.out.println("The sum of 4 and 5 is: "+sum2(4,5));
        System.out.println("The sum of 4 and 5 is: "+sum2(4));               //sum ke andr kuch nhi diya toh 0 print krega voh..
        System.out.println("The sum of 4,5,6 and 7 is: "+sum2(4,5,6,7));
    }
}

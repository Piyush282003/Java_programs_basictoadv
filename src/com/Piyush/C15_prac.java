package com.Piyush;

import java.util.Scanner;

public class C15_prac {
    public static void main(String[] args) {

        //        QUESTION 1:
//        System.out.println("Enter the number of rows:");
//        Scanner rows = new Scanner(System.in);
//        int r= rows.nextInt();
//        for(int i=r; i>0; i--){
//            for(int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//
//        }


//        System.out.println("Enter the range:");
//        Scanner r = new Scanner(System.in);
//        int a= r.nextInt();
//        int i=0,sum=0;
//        while(i<=a){
//            sum=sum+(2*i);               //yeh sirf puch rha apko kitne numbers chaiye jese agr aap 5 krte ho toh 0 se 5 numbers dhundega jese 0,2,4,6,8 or iska sum=20 aajega..yeh aise h..thoda naya h but adv me h thoda..
//            //simple i+=2 krke bhi ho rha tha pr humne apna level increase krna h toh yeh krna bhi aana chaiye..
//            i++;
//        }
//        System.out.println("The sum of even numbers is "+sum);


//        System.out.print("Enter the number you want the table of: ");
//        Scanner sc = new Scanner(System.in);
//        int val=sc.nextInt();

//        QUESTION 3:
//        for(int i=10; i>0; i--){
//            System.out.println(val+" X "+i+" = "+val*i);
//        }

//        QUESTION 4:
//        for(int i=1; i<=10; i++){
//            System.out.println(val+" X "+i+" = "+val*i);
//        }

//        QUESTION 6:
//        System.out.print("Enter the number you want the factorial of: ");
//        Scanner sc = new Scanner(System.in);
//        int val=sc.nextInt();
//        int i=1;
//        int factorial=1;
//        while (i<=val){
//            factorial*=i;
//            i++;
//        }
//        System.out.println(factorial);


        System.out.print("Enter the number you want the table of: ");
        Scanner sc = new Scanner(System.in);
        int val=sc.nextInt();
        int sum=0;

        for(int i=1;i<=10;i++){
            sum=sum+(val*i);
        }
        System.out.println(sum);

    }
}

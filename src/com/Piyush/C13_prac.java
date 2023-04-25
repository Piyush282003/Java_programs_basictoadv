package com.Piyush;

import java.util.Scanner;

public class C13_prac {
    public static void main(String[] args) {
        //          question 2:
//        System.out.print("Enter the marks of physics: ");
//        Scanner mrks1 = new Scanner(System.in);
//        int a = mrks1.nextInt();
//
//        System.out.print("Enter the marks of maths: ");
//        Scanner mrks2 = new Scanner(System.in);
//        int b = mrks2.nextInt();
//
//        System.out.print("Enter the marks of chemistry: ");
//        Scanner mrks3 = new Scanner(System.in);
//        int c = mrks3.nextInt();
//
//        float percentage = (a+b+c)/3f;
//
//        if(percentage>=40 && a>=33 && b>=33 && c>=33){
//            System.out.println("You are pass..as your percentage is "+percentage+" and you have scoured above 33 in each subject..");
//        }
//        else{
//            System.out.println("You are fail..as your percentage is "+percentage);
//        }



//        question 3:

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income in lakhs per annum");
        float income=sc.nextFloat();
        float tax=0;
        if(income<=2.5){
            tax=tax+0;
        }
        else if(income>2.5f && income<=5f){
            tax=tax+0.05f*(income-2.5f);
        }
        else if(income>5.0f && income<=10.0f){
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(income-5f);
        }
        else if(income>10.0f){
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(10f-5f);
            tax=tax+0.3f*(income-10.0f);
        }
        System.out.println("The total tax paid by the employee is: "+tax+" lakhs");





//        question 4:
//        System.out.println("Enter the number:");
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//
//        switch(day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }


//        QUESTION 6:
//        System.out.println("Enter the input of your choice..");
//        Scanner sc = new Scanner(System.in);
//
//        String website = sc.nextLine();
//
//        if(website.endsWith(".com")){
//            System.out.println("It is an commercial website");
//        }
//        else if(website.endsWith(".org")){
//            System.out.println("It is an organizational website");
//        }
//        if(website.endsWith(".in")){
//            System.out.println("It is an indian website");
//        }

    }
}

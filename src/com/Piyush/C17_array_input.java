package com.Piyush;

import java.util.Scanner;

public class C17_array_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
            sum+=arr[i];
        }

        System.out.println("The sum of all ele is "+sum);
    }
}

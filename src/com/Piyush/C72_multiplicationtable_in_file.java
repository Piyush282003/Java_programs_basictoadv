package com.Piyush;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class C72_multiplicationtable_in_file {
    public static void main(String[] args) throws IOException {
        String table="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:-");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            table+= n+" X "+i+" = "+n*i;
            table+= "\n";
        }

        FileWriter fw=new FileWriter("Table.txt");                   //->yeh file bna bhi dega or andr uske write bhi kr dega..
        fw.write("Multiplication table of "+n+"\n"+table);
        fw.close();
    }
}

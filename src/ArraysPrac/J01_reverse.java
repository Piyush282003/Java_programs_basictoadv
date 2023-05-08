package ArraysPrac;

import java.util.*;


//import java.util.* ;
//        import java.io.*;
//        import java.util.ArrayList;
//
//public class Solution
//{
//    public static void reverseArray(ArrayList<Integer> l, int m)
//    {
//        // Write your code here.
//        int i=m+1,j=l.size()-1;
//        int arr[]=new int[l.size()];
//        for(int k=0;k<l.size();k++){
//            arr[k]=l.get(k);
//        }
//        while(i<j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }
//        l.clear();
//        for(i=0;i<arr.length;i++){
//            l.add(arr[i]);
//       }

//    }
//}






//************************************************************************************************************************************************





//import java.util.* ;
//import java.io.*;
//import java.util.ArrayList;
//
//public class Solution
//{
//    public static void reverseArray(ArrayList<Integer> l, int m)
//    {
//        // Write your code here.
//        int i=m+1,j=l.size()-1;
//        while(i<j){
//            Collections.swap(l,i,j);
//            i++;
//            j--;
//        }
//    }
//}

public class J01_reverse {
    public static void main(String[] args) {
//        Arraylist ko array me convert krne ke liye:-
//        int a[]=new int[l.size()];
//        for(int i=0;i<a.length;i++){
//            a[i]=l.get(i);
//        }
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(4);
        l.add(5);
        l.add(2);
        l.add(3);
        l.add(6);
        l.add(1);
        l.add(3);
        l.add(6);
        System.out.println(l);
        int k=0;
        int m=5;
        int i=m+1,j=l.size()-1;


//        list ko array me convert kiya but isme Object rhega type elements ka..
        Object[] arr=l.toArray();
        Object temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(Object f:arr){
            System.out.print(f+" ");
        }
        System.out.println();

//        array ko list me convert kiya hai humne
        List ls = Arrays.asList(arr);
        System.out.println(ls);
    }
}





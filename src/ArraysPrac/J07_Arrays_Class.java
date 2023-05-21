package ArraysPrac;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class J07_Arrays_Class {
    public static void main(String[] args) {
        Integer arr[]={1,-4,4,6,2,3,3,5,6,1,2,8};
        for(int i:arr){
            System.out.print(i+" ");
        }System.out.println();

        Arrays.sort(arr);                          //-->sort an array

        for(int i:arr){
            System.out.print(i+" ");
        }System.out.println();



//        ***************************************************************************************************************************


//        Arrays.sort(arr,2,6);                       //-->sort fron index 2 to 5 but not index 6
//
//        for(int i:arr){
//            System.out.print(i+" ");
//        }System.out.println();


//        ***************************************************************************************************************************


//        Arrays.sort(arr, Collections.reverseOrder());                              //->reverse me sorted order ko store krega..pr isme arr jo lia hoga usko Integer generic me lena hoga..
//
//        for(int i:arr){
//            System.out.print(i+" ");
//        }System.out.println();



//        ***************************************************************************************************************************


//        Collections.swap(Arrays.asList(arr),0,4);                          //->swap array elements using Arrays.asList()


//        for(int i:arr){
//            System.out.print(i+" ");
//        }System.out.println();



//        ***************************************************************************************************************************

//        System.out.println(Arrays.toString(arr));                                  //->convert to string


//        ***************************************************************************************************************************

//        Integer a[]=new Integer[10];
//        Arrays.fill(a,45);                                              //-->yeh default values daldega
////        Arrays.fill(a,2,7,45);
//        for(int i : a){
//            System.out.print(i+" ");
//        }


//        ***************************************************************************************************************************



//        Integer a[]=new Integer[10];
//        Collections.fill(Arrays.asList(a),45);
//        for(int i:a){
//            System.out.print(i+" ");
//        }


//        ***************************************************************************************************************************

        int b[]={1,2,34,5,6};
        int c[]=Arrays.copyOf(b,b.length);
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}

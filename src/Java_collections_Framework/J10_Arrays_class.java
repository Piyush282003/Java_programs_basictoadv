package Java_collections_Framework;

import java.util.Arrays;

public class J10_Arrays_class {
    public static void main(String[] args) {
        int [] num={1,2,3,4,5,6,7,8,9,10};
        int index= Arrays.binarySearch(num,4);              //binarySearch
        System.out.println(index);

        Arrays.sort(num);                           //for sorting

        for(int i:num){
            System.out.print(i+" ");
        }
        System.out.println();

        boolean [] arr=new boolean[10];
        Arrays.fill(arr,false);
        for(boolean b:arr){
            System.out.print(b+" ");
        }



    }
}

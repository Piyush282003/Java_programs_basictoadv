package com.Piyush;

import java.util.ArrayList;

public class C55_ArrayList {
    public static void main(String[] args) {

//        ArrayList<Integer> l1= new ArrayList<>(45);            //initial capacity dete hai hum iske brackett me
        ArrayList<Integer> l1= new ArrayList<>();
        l1.add(6);
        l1.add(5);
        l1.add(4);
        l1.add(6);
        l1.add(1);
        l1.add(0,45);                      //isse hum usme index bhi de dete hai
        l1.add(2,945);

        ArrayList<Integer> l2=new ArrayList<>(5);
        l2.add(150);
        l2.add(110);
        l2.add(120);


//        l1.addAll(l2);                                            //addAll se hum ek Arraylist ko dusre me daal skte hai..and ye l1 ke end me append krega
        l1.addAll(5,l2);                                            //5 index se shuru hojenge add hona
        l1.add(1);

//        l1.clear();


//        for(int i=0;i<l1.size();i++){
//            System.out.println(l1.get(i));
//        }

        System.out.println(l1.contains(150));
        System.out.println(l1.indexOf(150));
        System.out.println(l1.indexOf(1110));
        System.out.println(l1.indexOf(1));
        System.out.println(l1.lastIndexOf(1));

        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();

        l1.set(3,789456);

        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();
        System.out.println(l1.subList(3,6));
    }
}

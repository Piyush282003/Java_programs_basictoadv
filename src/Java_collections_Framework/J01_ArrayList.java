package Java_collections_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class J01_ArrayList {
    public static void main(String[] args) {
//        arrays ko dynamically size change nhi kr skte but arraylist ka kr skte hai


//        arraylist internally ek array bnake rkh dega and fr usme add hota rhega but ek baar full hone pr vo n+n/2+1 krke size ko bdha dega..
//        ArrayList<String> arr=new ArrayList<>();
//        arr.add("Piku");
//        arr.add("Gishu");
//        arr.add("Chinte");
//        arr.add("Lakshya");
//        System.out.println(arr);

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println(l);
        l.add(45);
        System.out.println(l);
        l.add(2,80);
        System.out.println(l);

        List<String> ls=new ArrayList<>();
        ls.add("Piku");
        ls.add("Aarchi");
        System.out.println(ls);

//        l.addAll(ls);                   -->error coz l integer ki hai and ls string ki


        List<Integer> l2=new ArrayList<>();
        l2.add(456);
        l2.add(4560);

        l.addAll(l2);                                     //ek dusri list ko add krdega
        System.out.println(l);

        System.out.println(l.subList(3,6));                    //index 3 4 5 wala aajega sublist me


        System.out.println(l.get(2));


//        1st way of printing all ele
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i));
            if(i!=l.size()-1){
                System.out.print("->");
            }
        }
        System.out.println();


        l.remove(2);                     //isme index dete hai hum remove krne ke liye
        System.out.println(l);
        l.remove(Integer.valueOf(456));                    //isme direct value dete hai
        System.out.println(l);



//        ******************************************************************************************************************


        List<Integer> l3=new ArrayList<>();
        l3.addAll(l);

        System.out.println(l3.equals(l));                           //yeh true dega jab saare elements same honge isme


//        for removing and inserting TC=>)(n)

        l.set(4,456123);                        //TC=>O(1)
        System.out.println(l);


        System.out.println(l.contains(456));                    //TC=>O(n)


//        2nd way of printing all ele
        for(Integer ele:l){
            System.out.print(ele+" ");
        }
        System.out.println();

//        3rd way of printing all ele
        Iterator<Integer> it= l.iterator();
        while(it.hasNext()){
            System.out.println("The element is "+it.next());
        }
        l.clear();                                 //list ko empty krdega
        System.out.println(l);


    }
}

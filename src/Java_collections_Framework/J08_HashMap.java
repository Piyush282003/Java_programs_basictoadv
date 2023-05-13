package Java_collections_Framework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class J08_HashMap {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();

        mp.put("One",1);
        mp.put("AFive",5);
        mp.put("Six",6);
        mp.put("Two",2);
        mp.put("Three",3);
        System.out.println(mp);

        mp.put("One",5);
        System.out.println(mp);

//        if(!mp.containsKey("One")){
//            mp.put("One",45);
//        }
//        System.out.println(mp);



        mp.putIfAbsent("One",45);
        System.out.println(mp);

        mp.putIfAbsent("FortyFive",45);
        System.out.println(mp);

//        *************************************************************************************************************************************

//        for iterating whole map
        System.out.println("Printing elements:-");
        for(Map.Entry<String,Integer> e:mp.entrySet()){
//            System.out.println(e);

            System.out.print(e.getKey()+" -> ");
            System.out.print(e.getValue()+" ");
            System.out.println();
        }
//        for printing keys
        for(String s:mp.keySet()){
            System.out.print(s+" ");
        }
        System.out.println();
//        for printing values
        for(Integer i:mp.values()){
            System.out.print(i+" ");
        }
        System.out.println();


//        ***************************************************************************************************************************************8

        mp.remove("One");
        System.out.println(mp);
        System.out.println(mp.containsValue(3));
        System.out.println(mp.isEmpty());
        System.out.println(mp.containsKey("One"));
    }
}

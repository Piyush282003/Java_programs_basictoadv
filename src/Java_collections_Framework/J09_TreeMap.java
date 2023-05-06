package Java_collections_Framework;

import java.util.Map;
import java.util.TreeMap;

public class J09_TreeMap {
    public static void main(String[] args) {
        Map<String,Integer> mp = new TreeMap<>();

        mp.put("One",1);
        mp.put("AFive",5);
        mp.put("Six",6);
        mp.put("Two",2);
        mp.put("Three",3);
        System.out.println(mp);

//        baaki same functions of hashmap

        int k=mp.getOrDefault("Seven",7);
        System.out.println(k);

        int b= mp.getOrDefault("One",45);
        System.out.println(mp);
    }
}

package com.Piyush;

import java.util.HashSet;

public class C58_Hashset {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>(6,0.5f);
        h1.add(4);
        h1.add(1);
        h1.add(5);
        h1.add(78);
        h1.add(756);

//        without loop se bhi hum saare elements print kr skte hai..
        System.out.println(h1);

    }
}

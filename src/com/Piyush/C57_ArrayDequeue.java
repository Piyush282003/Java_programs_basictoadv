package com.Piyush;

import java.util.ArrayDeque;

public class C57_ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> a = new ArrayDeque<>();

        a.add(5);
        a.add(1);
        a.add(2);
        a.add(9);
        a.add(15);
        System.out.println(a.size());
//        a.addFirst(4560);
        a.addLast(123);

        System.out.println(a.getFirst());
        System.out.println(a.getLast());
    }
}

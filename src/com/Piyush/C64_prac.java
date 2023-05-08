package com.Piyush;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class C64_prac {
    public static void main(String[] args) {
//        Que 1:
        List<Integer> l = new ArrayList<>();
//        l.add("P");
//        l.add("K");
//        l.add("J");
//        l.add("M");

        l.add(1);
        l.add(12);
        l.add(122);
        l.add(1224);
        l.add(12245);

//        Object is just like auto in C++..
        for(Object s:l){
            System.out.println(s);
        }


//        Que 2
        LocalTime lt= LocalTime.now();
        System.out.println(lt.getHour()+":"+lt.getMinute()+":"+lt.getSecond());

        Calendar c= Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
    }
}

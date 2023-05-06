package com.Piyush;

import java.util.Calendar;
import java.util.TimeZone;

public class C60_calender {
    public static void main(String[] args) {
//        Calender c=new Calendar();                    -->error
//        Calendar c= Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());


//        Calendar c= Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone().getID());
//        System.out.println(c.getTime());


        Calendar c= Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE));

        System.out.println(c.getTime());                       //-->it returns a Date Object
    }
}

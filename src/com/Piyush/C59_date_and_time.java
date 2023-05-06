package com.Piyush;

import java.util.Date;

public class C59_date_and_time {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());
//        System.out.println(System.currentTimeMillis()/1000/3600/24/365);       //-->no. of years

//        System.out.println(Long.MAX_VALUE);                         //->displays the maximum value of long type variable

//        Date d = new Date(2019,05,28);
//        Date d = new Date(2019,05,28,14,34,33);
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());                 //->yeh deprecated hai isliye line aari hai
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
    }
}

package com.Piyush;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C63_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();                //this is the date
        System.out.println(dt);


//        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-mm-yyyy");                 //this is the format
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/mm/yyyy");                 //this is the format
        String mydate=dt.format(df);                                                    //date and ofrmat ko merge kr diya
        System.out.println(mydate);

        DateTimeFormatter df2=DateTimeFormatter.ISO_LOCAL_DATE;                    //ISO_LOCAL_DATE is inbuilt format
        String s=dt.format(df2);
        System.out.println(s);


        DateTimeFormatter df3=DateTimeFormatter.ofPattern("dd/mm/yyyy  --E HH:MM a");                 //this is the format
//        E--> day
//        HH-->hours
//        MM-->Minutes
//        a-->am/pm
        String m=dt.format(df3);                                                    //date and ofrmat ko merge kr diya
        System.out.println(m);
    }
}

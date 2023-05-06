package com.Piyush;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C62_time_API {
    public static void main(String[] args) {
        LocalDate l =LocalDate.now();                 //-->only date
        System.out.println(l);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

    }
}

package com.Piyush;

public class C09_string_methods {
    public static void main(String[] args) {
        //        String name = "            PIYUSH is a good boy";
//        System.out.println(name);

//        int value = name.length();
//        System.out.println(value);
//
//        String lstr = name.toLowerCase();
//        System.out.println(lstr);
//
//        String ustr = name.toUpperCase();
//        System.out.println(ustr);
//
//        String tr = name.trim();
//        System.out.println(tr);

        String name = "PIYUSHisagoodisboy";

//        String substr = name.substring(4);
        String substr = name.substring(4,9);
        System.out.println(substr);
//
//
        String repstr = name.replace('i','y');
        System.out.println(repstr);

        boolean strtng = name.startsWith("P");
        System.out.println(strtng);

        boolean endng = name.endsWith("P");
        System.out.println(endng);

        char ch = name.charAt(2);
        System.out.println(ch);

        int st = name.indexOf("m");
//        int st = name.indexOf("P",7);
        System.out.println(st);

//        int str = name.lastIndexOf("is");
        name = "Harrynrry";
        int str = name.lastIndexOf("r",4);
        System.out.println(str);

        System.out.println(name.equals("PIYUSH"));
        System.out.println(name.equalsIgnoreCase("Piyush is a good boy"));            //equals wala case sensitive hota h...but equalsignorecase me bas words milne chaiye letter se frk nhi pdhta..


        System.out.println("I am escape sequence \"by using this we can use double quote\"");
    }
}

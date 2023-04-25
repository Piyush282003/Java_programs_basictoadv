package com.Piyush;

class myEmployee{
    private int id;
    private String name;

    //    methods below
    public void setId(int i){
        id=i;
    }
    public void setName(String n){
        name = n;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}

public class C25_access_modifier {
    public static void main(String[] args) {
        myEmployee piyush = new myEmployee();
//        piyush.id=12;
//        piyush.name="Piyush Bhai";                                  //-->throws an error due to private access modifier...

        piyush.setName("My name is Piyush..");
        System.out.println(piyush.getName());

        piyush.setId(12);
        System.out.println(piyush.getId());
    }
}

package com.Piyush;

class Employee2{
    int salary;
    String name;

    void print(){
        System.out.println("M sal is "+salary);
        System.out.println("My name is "+name);
    }
//    why we use public before int?--> que pucho
    public int getSalary(){
        return salary;
    }
    public void setname(String n){
        name=n;
    }

    public String getname(){
        return name;
    }
}
public class C24_custom_class {
    public static void main(String[] args) {
        Employee2 piyush = new Employee2();                   //instantiating a new Employee Object
//        setting attributes
        piyush.salary=23;
        piyush.name="Piyush Bhai..";
        piyush.print();

        int sal= piyush.getSalary();
        System.out.println(sal);

        String name = piyush.getname();
        System.out.println(name);

        piyush.setname("Girish Bhai..");
        System.out.println(name);

        piyush.setname("Girish Bhai..");
        String name2 = piyush.getname();
        System.out.println(name2);
    }
}

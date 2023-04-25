package com.Piyush;

class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void on(){
        System.out.println("Your phone is on");
    }
    public void name(){
        System.out.println("My name is Java");
    }
}
class Smartphone extends Phone{
    public void swagat(){
        System.out.println("Aapka swaagat hai");
    }
    public void name(){
        System.out.println("My name is java in class 2");
    }
}
public class C31_Dynamic_method_Dispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        Smartphone obj = new Smartphone();
        Phone obj = new Smartphone();                     //->Phone ka ek reference bnaya and Smartphone ka ek object bnaya
        obj.greet();
        obj.on();
        obj.name();                          //object ka name return hoga na ki reference ka
        //obj.swagat();                  --> error dega
    }
}

package com.Piyush;

 interface Bicycle{
     int item=100;
     void applybrake(int d);
     void speedup(int s);
 }
 interface HornBicycle{
     int a=45;
     void blowhornk3g();
     void blowhornk5g();
 }
 class AvonCycle implements Bicycle{
     void blowhornk3g(){
         System.out.println("Pee Pee Poo Poo");
     }void blowhornk5g(){
         System.out.println("Pee Pee Poo Poo");
     }
     public void applybrake(int d){
         System.out.println("Applying Brake");
     }
     public void speedup(int s){
         System.out.println("Speed Up");
     }
 }
 class Avon implements Bicycle,HornBicycle{
     public void blowhornk3g(){
         System.out.println("Pee Pee Poo Poo");
     }
     public void blowhornk5g(){
         System.out.println("Pee Pee Poo Poo");
     }
     public void applybrake(int d){
         System.out.println("Applying Brake");
     }
     public void speedup(int s){
         System.out.println("Speed Up");
     }
 }
public class C35_interfaces {
    public static void main(String[] args) {
//        AvonCycle a = new AvonCycle();
//        System.out.println(a.item);
//        a.applybrake(4);
//        a.blowhornk3g();


//        you cannot modu=ify the properties in interfaces as they are final
//        a.item=45;                                    -->error

        Avon e = new Avon();
        System.out.println(e.a);
    }
}

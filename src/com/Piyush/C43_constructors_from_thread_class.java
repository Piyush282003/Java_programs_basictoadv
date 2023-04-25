package com.Piyush;

class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        System.out.println("I am run method...");
//        while (true){
//            System.out.println("I am thread bhai..");
//        }
    }
}
public class C43_constructors_from_thread_class {
    public static void main(String[] args) {
        Mythr t1 = new Mythr("Piyush");
        t1.start();

        System.out.println("The id of the thread t1 is "+t1.getId());
        System.out.println("The name of the thread t1 is "+t1.getName());
    }
}

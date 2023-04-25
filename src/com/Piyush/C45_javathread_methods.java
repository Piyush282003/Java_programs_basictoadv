package com.Piyush;

class Mynewthr1 extends Thread{
    public Mynewthr1(String name){
        super(name);
    }
    public void run(){
//        System.out.println("I am run method...");
        int i=0;
        while (i<50000){
            System.out.println("I am thread bhai..");
            i++;
        }
    }
}
class Mynewthr2 extends Thread{
    public Mynewthr2(String name){
        super(name);
    }
    public void run(){
//        System.out.println("I am run method...");
        while (true){
            System.out.println("I am thread t2 bhai..most imp");
        }
    }
}
public class C45_javathread_methods {
    public static void main(String[] args) {
        Mynewthr2 t1 = new Mynewthr2("Piyush");
        Mynewthr2 t2 = new Mynewthr2("Piyush");
        t1.start();
//        try{
//            t1.join();
//
//        }catch(Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}

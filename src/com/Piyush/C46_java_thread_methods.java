package com.Piyush;

class MynewThr12 extends Thread{
    public MynewThr12(String name){
        super(name);
    }
    public void run(){
//        System.out.println("I am run method...");
        while (true){
            System.out.println("I am thread bhai..");
            try {
                Thread.sleep(455);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class MynewThr21 extends Thread{
    public MynewThr21(String name){
        super(name);
    }
    public void run(){
//        System.out.println("I am run method...");
        while (true){
            System.out.println("I am thread t2 bhai..most imp");
            try {
                Thread.sleep(455);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class C46_java_thread_methods {
    public static void main(String[] args) {
        MynewThr12 t1 = new MynewThr12("Piyush");
        MynewThr21 t2 = new MynewThr21("Piyush");
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

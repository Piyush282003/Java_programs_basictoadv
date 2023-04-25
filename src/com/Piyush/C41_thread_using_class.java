package com.Piyush;

class Mythread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("I am running T1");
            System.out.println("I am happy....");
        }
    }
    public void num(){
        System.out.println("I am num");
    }
}
class Mythread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("I am running T2 with chatting");
            System.out.println("I am not happy and huttt....");
        }
    }
    public void num(){
        System.out.println("I am num");
    }
}

public class C41_thread_using_class {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();

        t1.start();
        t2.start();
    }
}

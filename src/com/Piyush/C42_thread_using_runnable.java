package com.Piyush;

class MythreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
        System.out.println("I am a thread1 not a threat");
    }
}
class MythreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am a thread2 not a threat");
    }
}
public class C42_thread_using_runnable {
    public static void main(String[] args) {
        MythreadRunnable1 bullet1 = new MythreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MythreadRunnable2 bullet2 = new MythreadRunnable2();
        Thread gun2 = new Thread(bullet2);


        gun1.start();
        gun2.start();

    }
}

package Multithreading;

class Thyld extends Thread{
    public void run(){
//        Thread.yield();
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"->"+(i+1));
        }
    }
}
public class M10_yield {
    public static void main(String[] args) {
        Thyld t=new Thyld();
        t.start();
        Thread.yield();
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"->"+(i+1));
        }
    }
}

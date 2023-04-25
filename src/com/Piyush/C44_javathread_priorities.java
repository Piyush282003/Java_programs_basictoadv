package com.Piyush;

class Mythr1 extends Thread{
    public Mythr1(String name){
        super(name);
    }
    public void run(){
//        System.out.println("I am run method...");
        System.out.println("Thank You "+this.getName() + " and the id is "+ this.getId());
//        while (true){
//            System.out.println("Thank You "+this.getName());
////            System.out.println("I am thread bhai..");
//        }
    }
}
public class C44_javathread_priorities {
    public static void main(String[] args) {
        Mythr1 t1 = new Mythr1("Piyush1");
        Mythr1 t2 = new Mythr1("Piyush2");
        Mythr1 t3 = new Mythr1("Piyush3");
        Mythr1 t4 = new Mythr1("Piyush4");
        Mythr1 t5 = new Mythr1("Piyush5");

        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(3);
        t5.setPriority(9);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


        System.out.println(Thread.currentThread().getPriority());

    }
}

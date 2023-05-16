package Multithreading;

class Th extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Task");
    }

}

public class M06_naming_methods {
    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
//
////        System.out.println(10/0);                             //->Exception in thread "main"
//
//        Thread.currentThread().setName("Piyush");
//        System.out.println(10/0);                              //Exception in thread "Piyush" ayuega coz setName se kia h set toh vo "main" nhi dega

        Th p= new Th();
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
         p.start();

        Th p2= new Th();
        System.out.println(Thread.currentThread().getName());
         p2.start();
         Th p3= new Th();

        System.out.println(p.isAlive());

        p3.setName("Deep");
        System.out.println(Thread.currentThread().getName());
         p3.start();
    }
}

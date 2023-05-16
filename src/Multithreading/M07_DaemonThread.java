package Multithreading;

class Dae extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread");
        }
        else{
            System.out.println("Child Thread");
        }
    }
}
public class M07_DaemonThread {
    public static void main(String[] args) {
        System.out.println("Helo Piyush");
//        Thread.currentThread().setDaemon(true);                //-->not possible
        Dae d=new Dae();
        d.setDaemon(true);
        d.start();
    }
}

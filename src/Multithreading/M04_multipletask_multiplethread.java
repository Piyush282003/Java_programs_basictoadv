package Multithreading;

class Task1 extends Thread {
    public void run() {
        for(int i=0;i<300;i++){
            System.out.println("Task1");
        }
    }
}
class Task2 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Task2");
        }
    }
}
class Task3 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Task3");
        }
    }
}
public class M04_multipletask_multiplethread {
    public static void main(String[] args) {
//        for multiple threads multiple classes we have to create..therefore for 30 task = 30 threads = 30 classes...
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();

        t1.start();
        t2.start();
        t3.start();
    }
}

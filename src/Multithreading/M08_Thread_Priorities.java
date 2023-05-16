package Multithreading;

class Test3 extends Thread{
    public void run(){
        System.out.println("Child Thread");
        System.out.println(Thread.currentThread().getPriority());
    }
}
public class M08_Thread_Priorities {

    public static void main(String[] args) {
        System.out.println("Old thread "+Thread.currentThread().getPriority());

//        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
//        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);

        System.out.println("New thread "+Thread.currentThread().getPriority());

        Test3 t=new Test3();                   //agr iss line ko hum setpriority wale se pehle likh denge toh kuch frk nhi pdega...
        t.start();
    }
}

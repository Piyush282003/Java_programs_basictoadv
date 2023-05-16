package Multithreading;

class Test3 extends Thread{
    public void run(){
        System.out.print("Child Thread Prioity: ");
        System.out.println(Thread.currentThread().getPriority());
    }
}
public class M08_Thread_Priorities {

    public static void main(String[] args) {
        System.out.println("Old thread "+Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
//        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);

        System.out.println("New thread "+Thread.currentThread().getPriority());

        Test3 t=new Test3();
        t.setPriority(4);
        t.start();


       /*
        Test3 t=new Test3();
        Thread.currentThread().setPriority(4);
        t.start();                                           //->kThread Priority 5 hi rhegi coz apne Object initialize pehle hi kr dia toh usne properties parent ki leli hongi..
        */
    }
}

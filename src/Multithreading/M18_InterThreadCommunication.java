package Multithreading;

class TotalEarnings extends Thread{
    int total=0;
    public void run(){

        synchronized (this){
            for(int i=0;i<10;i++){
                total+=100;
            }
            this.notify();
        }

    }
}

public class M18_InterThreadCommunication {
    public static void main(String[] args) throws InterruptedException {
        TotalEarnings t=new TotalEarnings();
        t.start();

//        System.out.println("Total earning is "+t.total+"rs.");                            //->give 0..

        synchronized (t){
            t.wait(100);                                         //try-catch or throws use krna hai..
        }
        System.out.println("Total earning is "+t.total+"rs.");
    }
}

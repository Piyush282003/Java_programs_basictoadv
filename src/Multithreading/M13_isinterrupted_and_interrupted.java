package Multithreading;

class Tintrp extends Thread{
    public void run(){
        System.out.println(Thread.interrupted());
//        System.out.println(Thread.currentThread().isInterrupted());
        try{
            for(int i=0;i<5;i++){
//                System.out.println(Thread.interrupted());
                System.out.println(i+1);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println("Thread interrupted:-"+e);                //java.lang.InterruptedException: sleep interrupted
        }
    }
}
public class M13_isinterrupted_and_interrupted {
    public static void main(String[] args) {
        Tintrp t=new Tintrp();
        t.start();
        t.interrupt();
    }
}

package Multithreading;


public class M11_b_join {
    static Thread mainthread;

    static class Thjoinb extends Thread{
        public void run(){
            try{
                mainthread.join();                         //isme child thread is waiting for main thread to complete...
            }catch (Exception e){
                System.out.println(e);
            }
            try{
                for(int i=0;i<5;i++){
                    System.out.println("Child Thread "+(i+1));
                    Thread.sleep(100);
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        mainthread=Thread.currentThread();
        Thjoinb t=new Thjoinb();
        t.start();

        try{
            for(int i=0;i<5;i++){
                System.out.println("Main Thread "+(i+1));
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

package Multithreading;

class Thint extends Thread{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println(i+1);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println("Thread interrupted:-"+e);                //java.lang.InterruptedException: sleep interrupted
        }
    }
}
public class M12_interrupt {
    public static void main(String[] args) {
        Thint t=new Thint();
        t.start();
        t.interrupt();
    }
}

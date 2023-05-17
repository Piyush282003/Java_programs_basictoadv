package Multithreading;

class Thjoin extends Thread{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Child Thread "+(i+1));
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
public class M11_a_join {
    public static void main(String[] args){
        Thjoin t=new Thjoin();
        t.start();

        try{
            t.join();                                //isko bhi try-catch me lgana pdhega...isme main thread is waiting for child thread to complete..
        }catch (Exception e){
            System.out.println(e);
        }

        try{
            for(int i=0;i<5;i++){
                System.out.println("Main Thread "+(i+1));
                Thread.sleep(10);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

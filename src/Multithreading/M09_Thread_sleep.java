package Multithreading;
class Tst extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try{
//                Thread.sleep(1000);
                Thread.sleep(-1);
//                Thread.sleep(1000,-1);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName()+"->"+ (i+1));
        }
    }
}
public class M09_Thread_sleep {
    public static void main(String[] args) {
//        for(int i=0;i<5;i++){
//            try{
//                Thread.sleep(1000);
//            }catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println(Thread.currentThread().getName()+"->"+ (i+1));
//        }


//        upr jo sleep tha vo main thread me ho rha tha pr neeche wale me Thread 0 hoga
        Tst t=new Tst();
        t.start();
        Tst t1=new Tst();
        t1.start();
    }
}

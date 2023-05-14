package Multithreading;

class Test2 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello Piyush "+i);
        }
    }
}
public class M02_singletask_multiplethreads {
    public static void main(String[] args) {
//        3 threads kaam kr rhe hai...t,p and main
        Test2 t=new Test2();
        t.start();

        Test2 p=new Test2();
        p.start();
    }
}

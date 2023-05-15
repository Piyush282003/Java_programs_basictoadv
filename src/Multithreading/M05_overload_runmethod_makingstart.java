package Multithreading;

class Testing extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Run1");
        }
    }
    public void run(String s){
        for(int i=0;i<100;i++){
            System.out.println("Run1"+s);
        }
    }
    public void start(){
        System.out.println("Start");
    }
}
public class M05_overload_runmethod_makingstart {
    public static void main(String[] args) {
        Testing t=new Testing();
        t.start();                                   //pehle toh start se run wala call ho rha tha but isme jb humne override kr dia toh vahi call hoga jo humne bnaya hai...
//        t.run("4");
        t.run();
    }
}

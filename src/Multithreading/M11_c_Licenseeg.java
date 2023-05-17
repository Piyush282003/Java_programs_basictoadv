package Multithreading;

class Medical extends Thread{
    public void run(){
        System.out.println("Medical started");
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Medical completed");
    }
}
class TestDriver extends Thread{
    public void run(){
        System.out.println("TestDriver started");
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("TestDriver completed");
    }
}
class Officer extends Thread{
    public void run(){
        System.out.println("Officer started");
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Officer completed");
    }
}
public class M11_c_Licenseeg {
    public static void main(String[] args) throws InterruptedException{
        Medical m=new Medical();
        m.start();

        m.join();              //main thread is waiting for medical thread to join

        TestDriver td=new TestDriver();
        td.start();

        td.join();              //main thread is waiting for testdriver thread to join

        Officer o=new Officer();
        o.start();

    }
}

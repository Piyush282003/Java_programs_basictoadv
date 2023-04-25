package com.Piyush;

interface Mycamera2{
    void takeinput();
    void recordvideo();

    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kvideo(){
        greet();
        System.out.println("Recording in 4k video");
    }
}
interface Mywifi2{
    void connecttonetwork(String network);
    String [] getNetworks();
}

class MyCellPhone2{
    void cellphone(int phonenum){
        System.out.println("Calling "+phonenum);
    }
    void calling(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellPhone implements Mycamera2,Mywifi2{
    public void takeinput(){
        System.out.println("Taking snap..");
    }
    public void recordvideo(){
        System.out.println("recording Video");
    }
    public void connecttonetwork(String network){
        System.out.println("Connecting to "+network);
    }
    public String [] getNetworks(){
        String [] ntwrklist = {"Harry","Piku","Gishu"};
        return  ntwrklist;
    }

//    public void record4kvideo(){                                     //-> ye default ko overwrite kr dega
//        System.out.println("4k hai bhai but kya kr skte hai");
//    }
}
public class C38_polymorphism_in_interfaces {
    public static void main(String[] args) {
         Mycamera2 cam1 = new MySmartPhone2();
//         cam1.connecttonetwork();                                  -->error dega coz hum sirf interface Mycamera2 ke methods ko use kr skte hai..
        cam1.record4kvideo();
    }
}

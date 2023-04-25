package com.Piyush;

interface Mycamera{
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
interface Mywifi{
    void connecttonetwork(String network);
    String [] getNetworks();
}

class MyCellPhone{
    void cellphone(int phonenum){
        System.out.println("Calling "+phonenum);
    }
    void calling(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements Mycamera,Mywifi{
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
public class C36_defaultmethods {
    public static void main(String[] args) {
        MySmartPhone s = new MySmartPhone();
        String [] arr = s.getNetworks();
        for(String i:arr){
            System.out.println(i);
        }

        s.record4kvideo();
//        s.greet();                           -->error
    }
}

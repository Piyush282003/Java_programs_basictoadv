package Multithreading;

class Test extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello Piyush "+i);
        }
    }
}
public class M01_singletask_singlethread {
    public static void main(String[] args) {
/*        Interview Que:- How many threads are working here?
        by default yha 2 threads kaam kr rhe hai:ek jo humne bnaya ,ie, t and dusra jvm ne bnaya ,ie, main ..*/
        Test t=new Test();
        t.start();

/*      t.start();                  //->IllegalThreadStateException aayega coz ek baar jab t.start() krke
        humne thread chla dia toh vo sb krne ke phunch jayega dead state me ,ie, marr jayega toh fr se hum use start ya zinda nhi kr skte...*/
    }
}

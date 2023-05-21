package Multithreading;


class BookTheaterSeat4{
    static int totalseats=20;
    static synchronized void bookseats(int seats){
//    synchronized static void bookseats(int seats){
        if(totalseats>=seats){
            System.out.println(seats+" seats booked successfully");
            totalseats=totalseats-seats;
            System.out.println("Seats left: "+totalseats);
        }
        else{
            System.out.println("Sorry "+ seats+" seats cannot be booked");
            System.out.println("Seats left: "+totalseats);
        }
    }
}
class Mythread1 extends Thread{
    BookTheaterSeat4 b;
    int seats;
    Mythread1(BookTheaterSeat4 b,int seats){
        this.b=b;
        this.seats=seats;
    }
    public void run(){
        b.bookseats(seats);
    }
}
class Mythread2 extends Thread{
    BookTheaterSeat4 b;
    int seats;
    Mythread2(BookTheaterSeat4 b,int seats){
        this.b=b;
        this.seats=seats;
    }
    public void run(){
        b.bookseats(seats);
    }
}
class MovieBookApp4{


    public static void main(String[]args){
        BookTheaterSeat4 b1=new BookTheaterSeat4();          //1st objwct

        Mythread1 t1=new Mythread1(b1,7);
        t1.start();

        Mythread2 t2=new Mythread2(b1,6);
        t2.start();


        BookTheaterSeat4 b2=new BookTheaterSeat4();                  //2nd object

        Mythread1 t3=new Mythread1(b2,5);
        t3.start();

        Mythread2 t4=new Mythread2(b2,9);
        t4.start();


    }
}

//public class M17_Staticsynchronization {
//}

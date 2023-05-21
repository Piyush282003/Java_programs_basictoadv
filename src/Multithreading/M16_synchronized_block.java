package Multithreading;

class BookTheaterSeat3{
    int totalseats=10;
    void bookseats(int seats){

        System.out.println("Hi: "+Thread.currentThread().getName());
        System.out.println("Hi: "+Thread.currentThread().getName());
        System.out.println("Hi: "+Thread.currentThread().getName());
        System.out.println("Hi: "+Thread.currentThread().getName());
        System.out.println("Hi: "+Thread.currentThread().getName());
        System.out.println("Hi: "+Thread.currentThread().getName());
        System.out.println("Hi: "+Thread.currentThread().getName());
        System.out.println("Hi: "+Thread.currentThread().getName());
        System.out.println("Hi: "+Thread.currentThread().getName());
        System.out.println("Hi: "+Thread.currentThread().getName());

        synchronized (this){
            if(totalseats>=seats){
                System.out.println(seats+" seats booked successfully");
                totalseats=totalseats-seats;
                System.out.println("Seats left: "+totalseats);
            }
            else{
                System.out.println("Sorry seats cannot be booked");
                System.out.println("Seats left: "+totalseats);
            }
        }

        System.out.println("Hi: "+Thread.currentThread().getName());
        System.out.println("Hi: "+Thread.currentThread().getName());
        System.out.println("Hi: "+Thread.currentThread().getName());
        System.out.println("Hi: "+Thread.currentThread().getName());
        System.out.println("Hi: "+Thread.currentThread().getName());
        System.out.println("Hi: "+Thread.currentThread().getName());
        System.out.println("Hi: "+Thread.currentThread().getName());
        System.out.println("Hi: "+Thread.currentThread().getName());
        System.out.println("Hi: "+Thread.currentThread().getName());
        System.out.println("Hi: "+Thread.currentThread().getName());

    }
}
class MovieBookApp3 extends Thread{
    static BookTheaterSeat3 b;
    int seats;
    public void run(){
        b.bookseats(seats);
    }
    public static void main(String[]args){
        b=new BookTheaterSeat3();


        MovieBookApp3 deepak=new MovieBookApp3();
        deepak.seats=7;
        deepak.start();


        MovieBookApp3 amit=new MovieBookApp3();
        amit.seats=6;
        amit.start();
    }
}
//public class M16_synchronized_block {
//
//}

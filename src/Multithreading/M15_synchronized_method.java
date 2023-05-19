package Multithreading;

class BookTheaterSeat2{
    int totalseats=10;
    synchronized void bookseats(int seats){
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
}
class MovieBookApp2 extends Thread{
    static BookTheaterSeat2 b;
    int seats;
    public void run(){
        b.bookseats(seats);
    }
    public static void main(String[]args){
        b=new BookTheaterSeat2();

        MovieBookApp2 deepak=new MovieBookApp2();
        deepak.seats=7;
        deepak.start();

        MovieBookApp2 amit=new MovieBookApp2();
        amit.seats=6;
        amit.start();
    }
}
//public class M15_synchronized_method {
//}

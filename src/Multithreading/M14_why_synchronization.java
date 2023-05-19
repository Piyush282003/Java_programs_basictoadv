package Multithreading;


class BookTheaterSeat{
    int totalseats=10;
    void bookseats(int seats){
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
class MovieBookApp extends Thread{
    static BookTheaterSeat b;
    int seats;
    public void run(){
//        BookTheaterSeat b=new BookTheaterSeat();               //agr yeh upr static na bnakr yhi object bnate toh depak ka alg bnta and amit ka alag...isliye jo code likha aise hi way se krna or smjhna..
        b.bookseats(seats);
    }
    public static void main(String[]args){
        b=new BookTheaterSeat();

        MovieBookApp deepak=new MovieBookApp();
        deepak.seats=7;
        deepak.start();

        MovieBookApp amit=new MovieBookApp();
        amit.seats=6;
        amit.start();
    }
}
//public class M14_why_synchronization {
//    public static void main(String[] args) {
//
//    }
//}

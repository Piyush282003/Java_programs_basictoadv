package com.Piyush;

class Library{
    String [] books;
    int noofbooks;
    Library(){
        this.books = new String[100];
        this.noofbooks=0;
    }

    void addbook(String book){
        this.books[noofbooks]=book;
        System.out.println(book + " in Library");
        noofbooks++;
    }
    void availablebooks(){
        for(String book:this.books){
            if(book==null){
                continue;
            }
            System.out.println("* "+book+" is present..");
        }
    }
    void issuebooks(String book){
        for(int i=0;i<this.books.length;i++){
            if (this.books[i]==book) {
                System.out.println("Your book is issued..");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("This book doesn't exist..");
    }
    void returnbook(String book){
        addbook(book);
    }
}
public class C40_books {
    public static void main(String[] args) {
        Library l = new Library();
        l.addbook("C++");
        l.addbook("Java");
        l.addbook("C");
        l.addbook("C#");

        l.availablebooks();

        l.issuebooks("C");
        l.availablebooks();

        l.returnbook("C");
        l.availablebooks();
    }
}

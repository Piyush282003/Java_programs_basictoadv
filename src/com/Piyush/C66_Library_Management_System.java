package com.Piyush;

import javax.xml.namespace.QName;
import java.util.ArrayList;

class Book{
    public String name,author;
    Book(String name,String author){
        this.name=name;
        this.author=author;
    }
    @Override
    public String toString(){
        return "Book{"+"name='"+name+'\''+", author'"+author+'\''+'}';
    }
}

class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books){
        this.books=books;
    }
    public void returnBook(Book b){
        System.out.println("The book has been returned");
        this.books.add(b);
    }
    public void addBook(Book b){
        System.out.println("The book has been added");
        this.books.add(b);
    }
    public void issueBook(Book b,String issuedTo){
        System.out.println("The book has been issued to "+issuedTo);
        this.books.remove(b);
    }


    public void displayBooks(){
        System.out.println(this.books);
    }
}
public class C66_Library_Management_System {
    public static void main(String[] args) {
        ArrayList<Book> a=new ArrayList<>();
        a.add(new Book("Algorithms","Piyush"));
        a.add(new Book("DSA","Piku"));
        a.add(new Book("Java","PK"));
        MyLibrary l=new MyLibrary(a);
        l.addBook(new Book("C++","PKu."));

        l.displayBooks();

        Book b=new Book("C","Pkh.");
        l.addBook(b);
        l.displayBooks();

        l.issueBook(b,"Girish");
        l.displayBooks();
    }
}

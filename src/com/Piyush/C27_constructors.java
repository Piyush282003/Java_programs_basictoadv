package com.Piyush;

class mymainemployee{
    private int id;
    private String name;

    //    below is a constructor so pls aise use krne h or likhna h iska dhyan rkho..
    public mymainemployee(){
        id=45;
        name="Your-name-here";
    }
    public mymainemployee(String myname){
        id=345;
        name=myname;

    }
    public mymainemployee( int myid, String myname){
        id=myid;
        name=myname;

    }
    public void setId(int i){
        id = i;
    }
    public void setName(String n){
        name=n;
    }
    public int getId(){return id;}
    public String getName(){return name;}
}

public class C27_constructors {
    public static void main(String[] args) {
//        mymainemployee piyush = new mymainemployee();
//        mymainemployee piyush = new mymainemployee(123456,"Girish Bhai");                   //ise pata khud chal jayega ki kis constructor ki baat ho rhi h...
        mymainemployee piyush = new mymainemployee("Girish Bhai");
//        piyush.setId(45);
//        piyush.setName("Piyush Bhai");

        System.out.println(piyush.getId());
        System.out.println(piyush.getName());
    }
}

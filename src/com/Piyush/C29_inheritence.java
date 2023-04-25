package com.Piyush;

class Base{
    int x;
    Base(){
        System.out.println("I am base constructor");
    }
    Base(int a){
        System.out.println("I am a constructor with value of a as: "+a);
    }
    public void setx(int x){
        this.x=x;
    }
    public int getx(){
        return x;
    }
    public void printmex(){
        System.out.println("Hi bro i am base");
    }
}
class Derived extends Base{
    int y;
    Derived(){
//        super(45);
        System.out.println("I am Derived constructor");
    }
    Derived(int x,int y){
        super(x);
        System.out.println("The value of y is: "+y);
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
    public void printmey(){
        System.out.println("Hi bro i am derived");
    }
}
class Derived2 extends Derived{
    Derived2(){
        System.out.println("I am Derived2");
    }
    Derived2(int x,int y,int z){
        super(x,y);
        System.out.println("The value of z in derived2 is: "+z);
    }
}
public class C29_inheritence {
    public static void main(String[] args) {
//        Derived d= new Derived();
//        d.setx(4);
//        System.out.println(d.getx());
//        d.printmex();

//        Derived d = new Derived(4,6);


        Derived2 d = new Derived2(4,7,9);
    }
}

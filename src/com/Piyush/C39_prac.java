package com.Piyush;

abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    @Override
    void write(){
        System.out.println("I am writing");
    }
    @Override
    void refill(){
        System.out.println("I am refill");
    }
    void meth(){
        System.out.println("I am meth");
    }
}
public class C39_prac {
    public static void main(String[] args) {
        FountainPen f = new FountainPen();
        f.write();
    }
}

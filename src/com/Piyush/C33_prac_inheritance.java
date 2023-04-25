package com.Piyush;

class Circle{
    public int radius;
    Circle(){
        System.out.println("I am default circle");
    }
    Circle(int radius){
        System.out.println("I am circle");
        this.radius=radius;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    public int height;

    Cylinder(int radius,int height){
        super(radius);                                    //agr super na lgate toh default constructor run hoga bs...
        System.out.println("I am cylinder");
        this.height=height;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class C33_prac_inheritance {
    public static void main(String[] args) {
//        Circle objc = new Circle(2);
        Cylinder c = new Cylinder(2,3);
    }
}

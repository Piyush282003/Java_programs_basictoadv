package com.Piyush;

interface SampleInterface{
    void meth1();
    void meth2();
}
interface ChildSampleInterface extends SampleInterface{
    void meth3();
    void meth4();
}
class Myclass implements SampleInterface{
    public void meth3(){
        System.out.println("I am meht3");
    }
    public void meth4(){
        System.out.println("I am meht4");
    }
    public void meth1(){
        System.out.println("I am meht1");
    }
    public void meth2(){
        System.out.println("I am meht2");
    }
}
public class C37_inheritance_in_interface {
    public static void main(String[] args) {
        Myclass c = new Myclass();
        c.meth1();
        c.meth2();
    }
}

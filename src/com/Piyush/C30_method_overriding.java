package com.Piyush;

class A{
    public int a;
    public int harry(){
        return a;
    }
    public void meth2(){
        System.out.println("I m method2 of class A");
    }
}
class B extends A{

    @Override                        //yeh mandatory nhi h but recommended hai coz agr aage jaake A me changes hue meth2 me toh ye @Override wala error dene lagjega..
    public void meth2(){
        System.out.println("I m method2 of class B");
    }
    public void meth3(){
        System.out.println("I m method3 of class B");
    }
}
public class C30_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}

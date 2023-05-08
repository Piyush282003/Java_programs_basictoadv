package com.Piyush;

interface DemoAno{
    void meth1();
    void meth2();
}
class AnonyDemo implements DemoAno{
    void display(){
        System.out.println("Hello bhai");
    }
    @Override
    public void meth1(){
        System.out.println("I am meth 1");
    }
    @Override
    public void meth2(){
        System.out.println("I am meth 2");
    }
}

public class C68_anonymous_classes {
    public static void main(String[] args) {
//        AnonyDemo a = new AnonyDemo();
//        a.meth1();


//        DemoAno obj = new AnonyDemo();
//        obj.meth2();

//*****************************************************************************************************************************************


//        anonymous class
        DemoAno d = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("I am meth1");
            }

            @Override
            public void meth2() {
                System.out.println("I am meth2");
            }
        };
        d.meth1();
    }
}

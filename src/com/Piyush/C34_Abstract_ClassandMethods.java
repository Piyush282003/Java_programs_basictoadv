package com.Piyush;

abstract class Parent{
    Parent(){
        System.out.println("I m constructor of Parent");
    }
    public void sayhello(){
        System.out.println("Hello parent");
    }
    abstract public void greet();
}
class Child1 extends Parent{
    @Override
    public void greet(){
        System.out.println("Hello child1");
    }
}
abstract class Child2 extends Parent{
    public void swagat(){
        System.out.println("Swagat hai Child2");
    }
}
abstract class Child3 extends Parent{
    @Override
    public void greet(){
        System.out.println("Hello child3");
    }
}
public class C34_Abstract_ClassandMethods {
    public static void main(String[] args){
        Child1 c1 = new Child1();
//        Parent pc = new Child1();
//                Parent p = new Parent();                            -->not allowed as Parent is an abstract class
        //        Child2 c = new Child2();                            -->not allowed as Child2 is an abstract class
//                Child3 c3 = new Child3();                           //-->not allowed as it is also an abstract class
    }
}

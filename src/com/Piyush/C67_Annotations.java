package com.Piyush;

@FunctionalInterface
interface myfuncint{
    void thismeth();
//    void thismeth2();                   //->functioninterface me multiple methods nhi bna skte
}


class NewPhone extends Phone{
    @Override
    public void on(){
        System.out.println("Your newphone is on");
    }

    @Deprecated
    public int sum(int a,int b){
        return a+b;
    }
}
public class C67_Annotations {
//    @SuppressWarnings("deprecation")                         //->isse jo vo sum pr line aa rhi hai vo nhi aayegi..
    public static void main(String[] args) {
        NewPhone n = new NewPhone();
        n.on();
        n.sum(5,6);                     //deprecated hai isliye line ayi hai

    }
}

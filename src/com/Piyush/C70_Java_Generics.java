package com.Piyush;

import java.util.ArrayList;

//just like template in cpp
class Mygeneric<T1>{
    int val;
    private T1 t1;
    public Mygeneric(int val,T1 t1){
        this.val=val;
        this.t1=t1;
    }
    public int getval(){
        return val;
    }
    public void setval(int val){
        this.val=val;
    }
    public T1 gett1(){
        return t1;
    }
    public void sett1(T1 t1){
        this.t1=t1;
    }
}

class Mygenerci2<T1,T2>{
    private T1 a;
    private T2 b;

    public Mygenerci2(T1 a, T2 b) {
        this.a = a;
        this.b = b;
    }

    public T2 getB() {
        return b;
    }

    public void setB(T2 b) {
        this.b = b;
    }

    public T1 getA() {
        return a;
    }

    public void setA(T1 a) {
        this.a = a;
    }
}
public class C70_Java_Generics {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("str1");
        arrayList.add(54);
        arrayList.add(643);

        Object a = arrayList.get(2);
/*        humne koi type nhi di hai arrayList ko toh vo hr cheez ko object maanega toh agr hume maanlo int me lena hai arrayList ka koi
        element toh use typecast krna pdega....agr Integer upr daaldete ArrayList me toh typecasting ki zrurt na pdhti..
*/
        int b = (int)arrayList.get(2);
        System.out.println(b);

//        int c=(int)arrayList.get(0);              //-->yeh compile time error toh nhi pr yeh runtime error dega(coz string hai jo ap int me lene ka try kr rhe ho) jiska root cause bhi na bta payega
//        System.out.println(c);



//************************************************************************************************************************



        Mygeneric<String> g1=new Mygeneric(25,"Hello Bhai");
        String s=g1.gett1();
        System.out.println(s);


        Mygenerci2<Integer,String> g2=new Mygenerci2<Integer, String>(28,"Piyush");
        int m=g2.getA();
        String n=g2.getB();
        System.out.println(n+" "+m);

    }
}

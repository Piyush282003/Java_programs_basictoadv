package com.Piyush;

public class C18_methods {

    static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        //    method is just like a function..
            int a=5;
            int b=7;
            int c;
//        agr static na lagaye toh yeh obj krke and upr se static na lagaya ho toh kaam aata h..yeh krna pdhta h toh plz yeh dhyan me rkhe..

//        C18_methods obj = new C18_methods();
//        c=obj.logic(a,b);
            c=logic(a,b);
            System.out.println(c);

            int a1=50;
            int b1=7;
            int c1;
            c1=logic(a1,b1);
            System.out.println(c1);
    }
}

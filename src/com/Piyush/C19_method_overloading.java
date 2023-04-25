package com.Piyush;

public class C19_method_overloading {
    static void telljoke(){
        System.out.println("I in vented a new word..\n"+"Plagiarism!");
    }

    static void foo(){
        System.out.println("good morning bro..");
    }
    static void foo(int a){
        System.out.println("good morning "+a+" bro..");
    }
    static void foo(int a,int b){
        System.out.println("good morning "+a+" bro.."+b);
    }
    static void change(int a){
        a=98;
    }
    static void change2(int [] arr){
        arr[0]=98;
        arr[1]=65;
    }


    public static void main(String[] args) {
        telljoke();
        int x=45;
//        yeh change nhi kr payega coz iski toh upr copy jaayegi na yeh original thoda jayega..
        change(x);
        System.out.println("The value after running is "+x);


//        changing the array:
        int [] mrks = {12,34,56,78,90,46};
        change2(mrks);
//        array change ho skta h coz yeh reference pass krta h sif=dha...toh yeh yaad rkho..
        System.out.println("The value after running change is: "+mrks[0]+mrks[1]);

        foo();
        foo(300);
        foo(34,56);
    }
}

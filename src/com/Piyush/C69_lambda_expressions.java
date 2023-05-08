package com.Piyush;

//FunctionalInterface                             //-->jisme ek method hota hai bs..
interface DAno{
//    void meth1();
    void meth1(int a);
}

//class HarryFunc implements DAno{
//    @Override
//    public void meth1(){
//        System.out.println("HarryFunc meth1");
//    }
//}

public class C69_lambda_expressions {
    public static void main(String[] args) {
//        DAno obj=new HarryFunc();
//        obj.meth1();


//        Lambda Expression
//        DAno d = ()->{                                                 //a ka type isliye nhi lia coz java is smart enough ki use pta hai ki interface me ek hi method hai and usme parameter me integer lia hai..
//            System.out.println("I am meth 1 of harryfunc ");
//        };
//        d.meth1();

        DAno d = (a)->{                                                 //a ka type isliye nhi lia coz java is smart enough ki use pta hai ki interface me ek hi method hai and usme parameter me integer lia hai..
            System.out.println("I am meth 1 of harryfunc "+a);
        };
        d.meth1(45);
    }
}

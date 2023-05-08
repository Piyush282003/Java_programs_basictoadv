package com.Piyush;

class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "Invalid input as a<b";
    }
    @Override
    public String getMessage(){
        return "I am getMessage";
    }
}
class DivideByZero extends Exception{
    @Override
    public String toString(){
        return "Can't divide as b==0";
    }
    @Override
    public String getMessage(){
        return "I am getMessage";
    }
}
class MaxInput extends Exception{
    @Override
    public String toString(){
        return "Maxinput Bhai";
    }
    @Override
    public String getMessage(){
        return "I am getMessage";
    }
}

//throws wala aap class ke sath nhi laga skte hai
class CustomCalculator{
    public double a,b;
    CustomCalculator(double a,double b) throws MaxInput{
        this.a=a;
        this.b=b;
//        try{
//            maxinp();
//        }catch (Exception e){
//            System.out.println(e);
//        }
        maxinp();
    }
    void maxinp() throws MaxInput{
        if(a>100000 || b>100000){
            throw new MaxInput();
        }
    }


    double add(){
        return a+b;
    }
    double subtract() throws InvalidInputException{
        if(a<b){
            throw new InvalidInputException();
        }
        return a-b;
    }
    double multiply(){
        return a*b;
    }
    double divide() throws DivideByZero{
        if(b==0){
            throw new DivideByZero();
        }
        return a/b;
    }
}
public class C65_Custom_Calculator {
    public static void main(String[] args) throws InvalidInputException,MaxInput,DivideByZero{
        CustomCalculator c1= new CustomCalculator(400,56);
//        try{
//            c1.subtract();
//        }catch (Exception e){
//            System.out.println(e.toString());
//        }
        System.out.println(c1.subtract());



        CustomCalculator c2= new CustomCalculator(4,0);
//        try{
//            double d=c2.divide();
////            double d=c.divide(4,10);
//            System.out.println(d);
//        }catch (Exception e){
//            System.out.println(e);
//        }
        c2.divide();



//        agr tryand catch use nhi krna or use red me dkhana hai toh public class jo main hoti hai usme throws krdo
    }
}

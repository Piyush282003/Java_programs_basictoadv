package com.Piyush;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int noofguesses=0;
    public int inputnum;

    Game(){
        Random rand = new Random();
        number = rand.nextInt(10);
//        System.out.println(number);
    }
    void takeuserinput(){
        System.out.println("Guess the number");
        Scanner sc= new Scanner(System.in);
        inputnum = sc.nextInt();
    }
    boolean iscrrctnum(){
        noofguesses++;
        if(inputnum==number){
            System.out.printf("You guessed it right,it was %d\nYou guessed it in %d attempts.",number,noofguesses);
            return true;
        }
        else if(inputnum>number){
            System.out.println("Too high");
        }
        else if(inputnum<number){
            System.out.println("Too low");
        }
        return false;
    }
}
public class C32_guess_the_num {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b=false;
        while(!b){
            g.takeuserinput();
            b=g.iscrrctnum();
        }
    }
}

package com.Piyush;

import java.util.Random;
import java.util.Scanner;

public class C26_rock_paper_scissor_game {
    public static void main(String[] args) {
        Random random = new Random();
        int computerinput = random.nextInt(3);                // 3 se mtlb ye 0,1,2 ko krega generate

        System.out.println("Enter 0 for rock, 1 for paper, 2 for scissor...");
        Scanner sc = new Scanner(System.in);
        int userinput = sc.nextInt();

        System.out.println("Computer Choice is: "+computerinput);

        if(userinput==computerinput){
            System.out.println("Draw");
        }
        else if (userinput==0 && computerinput==2 || userinput==1 && computerinput==0 || userinput==2 && computerinput==1){
            System.out.println("You Win...");
        }
        else{
            System.out.println("Computer Wins..");
        }

        if (computerinput==0){
            System.out.println("Computer choice: Rock");
        }
        else if (computerinput==1){
            System.out.println("Computer choice: Paper");
        }
        else if (computerinput==2){
            System.out.println("Computer choice: Scissor");
        }
    }
}

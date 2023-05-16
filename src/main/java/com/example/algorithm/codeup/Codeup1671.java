package com.example.algorithm.codeup;

import java.util.Scanner;

public class Codeup1671 {

    public String doPlay(int user, int computer){
        if(user == 0 && computer == 1){
            return "win";
        }else if (user == 1 && computer == 2){
            return "win";
        }else if(user == 2 && computer == 0){
            return "win";
        }else if(user == computer){
            return "tie";
        }else{
            return "lose";
        }

    }
    public static void main(String[] args) {
        Codeup1671 codeup1671 = new Codeup1671();
        Scanner sc = new Scanner(System.in);
        System.out.println(codeup1671.doPlay(sc.nextInt(),sc.nextInt()));
    }
}

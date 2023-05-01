package com.example.codeup.codeup.Codeup107x;

import java.util.Scanner;

public class Codeup1080
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputSum = sc.nextInt();
        int sum = 0;
        for(int i = 1; sum < inputSum; i++){
            sum += i;
            if(sum >= inputSum){
                System.out.println(i);
            }
        }
    }
}

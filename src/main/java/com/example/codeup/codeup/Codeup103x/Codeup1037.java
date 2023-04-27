package com.example.codeup.codeup.Codeup103x;

import java.util.Scanner;


public class Codeup1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num >= 0 && num <= 255) {
            System.out.printf("%c", num);
        }
    }
}



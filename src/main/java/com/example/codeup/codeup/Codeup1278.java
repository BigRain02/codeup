package com.example.codeup.codeup;

import java.util.Scanner;

public class Codeup1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        while(n > 0) {
            answer ++;
            n /= 10;
        }
        System.out.println(answer);

    }

}

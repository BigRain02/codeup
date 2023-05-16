package com.example.algorithm.codeup;

import java.util.Scanner;

public class Codeup1361 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j = 0; j < n; j++) {
            for (int i = 0; i < j; i++) {
                System.out.printf(" ");
            }
            System.out.printf("**");
            System.out.println();
        }
    }
}

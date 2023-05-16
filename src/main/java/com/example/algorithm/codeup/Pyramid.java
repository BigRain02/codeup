package com.example.algorithm.codeup;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j = 0; j < n; j++) {
            for (int i = 1; i < n - j; i++) {
                System.out.printf(" ");
            }
            for(int k = 0; k < j*2 + 1; k++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}


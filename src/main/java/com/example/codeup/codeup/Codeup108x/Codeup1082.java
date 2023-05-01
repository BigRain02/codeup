package com.example.codeup.codeup.Codeup108x;

import java.util.Scanner;

public class Codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int n = Integer.parseInt(String.valueOf(c), 16);
        for (int i = 1; i <= 15; i++) {
            int result = n * i;
            System.out.printf("%X*%X=%X\n", n, i, result);
        }
    }
}

package com.example.algorithm.codeup.Codeup108x;

import java.util.Scanner;

public class Codeup1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        for(int i = 1; i <= iVal; i++){
            if(i % 3 ==0) {
                System.out.printf("X ");
            }else {
                System.out.printf("%d ", i);
            }
        }
    }
}

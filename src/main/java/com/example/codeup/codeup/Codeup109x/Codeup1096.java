package com.example.codeup.codeup.Codeup109x;

import java.util.Scanner;

public class Codeup1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[19][19];
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            a[x-1][y-1] = 1;
        }
        for(int i = 0; i < 19; i++){
            for (int j = 0; j < 19; j++){
                System.out.printf("%d ",a[i][j]);
            }
            System.out.printf("\n");
        }
    }
}

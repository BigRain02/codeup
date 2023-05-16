package com.example.algorithm.codeup.Codeup109x;

import java.util.Scanner;

public class Codeup1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[19][19];
        for(int i = 0; i < 19; i++){
            for (int j = 0; j < 19; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            for(int j = 0; j < 19; j++){
                if(a[x][j] == 0) a[x][j] = 1;
                else a[x][j] = 0;
            }
            for(int k = 0; k < 19; k++){
                if(a[k][y] == 0) a[k][y] = 1;
                else a[k][y] = 0;
            }
        }

        for(int i = 0; i < 19; i++){
            for (int j = 0; j < 19; j++){
                System.out.printf("%d ",a[i][j]);
            }
            System.out.printf("\n");
        }


    }
}

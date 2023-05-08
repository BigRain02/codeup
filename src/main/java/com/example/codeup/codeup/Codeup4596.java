package com.example.codeup.codeup;

import java.util.Scanner;

public class Codeup4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[9][9];
        int i,j;
        int x = 0;
        int y = 0;
        int max = 0;
        for(i = 0; i < 9; i++){
            for(j = 0; j < 9; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j] > max){
                    max = arr[i][j];
                    x = i+1;
                    y = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d",x,y);

    }
}

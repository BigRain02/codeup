package com.example.codeup.codeup.Codeup109x;

import java.util.Scanner;

public class Codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[24];
        for(int i = 0; i < n; i++){
            a[sc.nextInt()]++;
        }
        for(int j = 1; j <= 23; j++){
            System.out.printf("%d ",a[j]);
        }
    }
}

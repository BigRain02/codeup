package com.example.codeup.codeup.Codeup109x;

import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int j = n-1; j >= 0; j--){
            System.out.printf("%d ",a[j]);
        }
    }
}

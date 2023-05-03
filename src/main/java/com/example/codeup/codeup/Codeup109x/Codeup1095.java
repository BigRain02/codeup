package com.example.codeup.codeup.Codeup109x;

import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int min = 10000;
        for(int j = 0; j < n; j++){
            if(min > a[j])min=a[j];
        }
        System.out.println(min);
    }
}

package com.example.codeup.codeup.Codeup108x;

import java.util.Scanner;

public class Codeup1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long sum = 0;
        for(int i = 0; sum < num; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}

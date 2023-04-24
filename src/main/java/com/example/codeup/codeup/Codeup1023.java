package com.example.codeup.codeup;

import java.util.Scanner;

public class Codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Num[] = sc.next().split("\\.");
        int first = Integer.parseInt(Num[0]);
        int second = Integer.parseInt(Num[1]);
        System.out.printf("%d\n%d",first,second);
    }
}

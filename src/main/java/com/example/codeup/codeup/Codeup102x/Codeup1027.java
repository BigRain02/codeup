package com.example.codeup.codeup.Codeup102x;

import java.util.Scanner;

public class Codeup1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String splitStr[] = str.split("\\.");
        int year = Integer.parseInt(splitStr[0]);
        int month = Integer.parseInt(splitStr[1]);
        int day = Integer.parseInt(splitStr[2]);
        System.out.printf("%02d-%02d-%04d",day,month,year);
    }
}
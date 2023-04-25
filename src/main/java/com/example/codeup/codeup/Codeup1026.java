package com.example.codeup.codeup;

import java.util.Scanner;

public class Codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String splitStr[] = str.split(":");
        int minute = Integer.parseInt(splitStr[1]);

        System.out.println(minute);
    }
}

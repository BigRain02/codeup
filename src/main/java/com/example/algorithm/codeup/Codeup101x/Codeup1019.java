package com.example.algorithm.codeup.Codeup101x;

import java.util.Scanner;

public class Codeup1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] strArr = str.split("\\.");
        System.out.printf("%04d.%02d.%02d",Integer.parseInt(strArr[0]),Integer.parseInt(strArr[1]),Integer.parseInt(strArr[2]));

    }
}

package com.example.codeup.codeup.Codeup108x;
import java.util.Scanner;

public class Codeup1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double iVal1 = sc.nextInt();
        double iVal2 = sc.nextInt();
        double iVal3 = sc.nextInt();


        double sum =  (iVal1*iVal2*iVal3/8.0/1024.0/1024.0);
        System.out.printf("%.2f MB",sum);
    }
}

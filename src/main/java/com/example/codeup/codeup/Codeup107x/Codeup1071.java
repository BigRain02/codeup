package com.example.codeup.codeup.Codeup107x;

import java.util.Scanner;

public class Codeup1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1; // 임의의 값으로 초기화
        while (num != 0) {
            num = sc.nextInt();
            switch (num) {
                case 0:
                    break;
                default:
                    System.out.println(num);
                    break;
            }
        }
    }
}

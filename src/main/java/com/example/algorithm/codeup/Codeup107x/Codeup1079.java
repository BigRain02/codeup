package com.example.algorithm.codeup.Codeup107x;
import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        boolean check = true;
        while (check) {
            str = sc.next();
            switch (str) {
                case "q":
                    System.out.println(str);
                    check = false;
                    break;
                default:
                    System.out.println(str);
                    break;
            }
        }
    }
}

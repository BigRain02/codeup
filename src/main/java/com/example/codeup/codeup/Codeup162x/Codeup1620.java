package com.example.codeup.codeup.Codeup162x;

import java.util.Scanner;

public class Codeup1620 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0 || sum > 9) { // 각 자릿수의 합이 한 자리가 될 때까지 반복
            if (n == 0) { // 다음 자릿수를 구하기 위해 sum 값을 n에 대입
                n = sum;
                sum = 0;
            }
            sum += n % 10; // 각 자릿수의 합을 구함
            n /= 10;
        }
        System.out.println(sum); // 한 자리가 된 합을 출력
    }
}

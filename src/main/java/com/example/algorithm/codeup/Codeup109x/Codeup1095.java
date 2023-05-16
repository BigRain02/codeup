package com.example.algorithm.codeup.Codeup109x;

import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 새로운 스캐너 선언
        int n = sc.nextInt(); // 번호를 부른 횟수 저장
        int a[] = new int[n]; // n의 크기를 가지는 새로운 배열 선언
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();// 출석을 부른 번호들을 순서대로 배열에 저장
        }
        int min = 0;
        for(int j = 0; j < n; j++){// 0부터 n만큼 반복
            if(j ==  0) min = a[j];
            else if(j != 0){
                if(min > a[j])min=a[j];// min이 a[j]보다 크다면, a[j]는 최솟값이 된다.
            }
        }
        System.out.println(min);
    }
}

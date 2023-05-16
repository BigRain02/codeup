package com.example.algorithm.insertsort;

import java.util.Arrays;

public class InsertionSort02 {
    public int[] sort(int[] arr, boolean isAscending){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >0 ; j--) {
                if((isAscending ? arr[j-1] - arr[j] : arr[j] - arr[j-1])> 0){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
        return arr;
    }

    public int[] sort(int[] arr){
        return sort(arr,true);
    }

    public static void main(String[] args) {
        int[] arr = {7,2,3,9,28,11};
        InsertionSort02 insertionSort02 = new InsertionSort02();
        arr = insertionSort02.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

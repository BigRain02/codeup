package com.example.algorithm.bubblesort;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort2 {
    Comparator<Integer> comparator;

    public BubbleSort2(Comparator<Integer> comparator) {
        this.comparator = comparator;
    }

    public int[] sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <= arr.length; j++) {
                if(arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort2 bubbleSort2 = new BubbleSort2(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        int[] arr = {7, 2, 3, 9, 28, 11};
        arr = bubbleSort2.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

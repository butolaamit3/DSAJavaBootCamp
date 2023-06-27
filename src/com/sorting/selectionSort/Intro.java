package com.sorting.selectionSort;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        int[] arr = {0,-6};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
             //find the max item in the remaining array and swap with correct index
            int last = arr.length-i-1; // means swap it with last index of remaining array
            int max = 0;
            for (int j = 1; j <=last ; j++) {
                if(arr[max]<arr[j]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] =arr[last];
            arr[last] = temp;
        }
    }
}

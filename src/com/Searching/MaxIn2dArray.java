package com.Searching;

import java.util.Arrays;

public class MaxIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6,},{7,54,8,9}};
        System.out.println(max(arr));
    }

    public static int max(int[][]arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]>max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
    public static int max1(int[][]arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}

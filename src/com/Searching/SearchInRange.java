package com.Searching;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,4,12,5,75,34,56,37,45,73,55,90,12,321,};
        System.out.println(search(arr,37,2,10));
    }

    public static int search(int[] arr, int target, int start, int end) {
        if(arr.length==0){
            return -1;
        }
        if(start>end){
            return -1;
        }
        for (int index = start; index <end ; index++) {
            if(arr[index]==target){
                return index;
            }
        }
        //this line will execute when none of the able return statement executed, hence target not found
        return -1;
    }
}

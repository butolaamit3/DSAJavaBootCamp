package com.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,12,5,75,34,56};
        System.out.println(search(arr,37));
    }

    public static int search(int[] arr, int target) {
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index <arr.length ; index++) {
            if(arr[index]==target){
                return index;
            }
        }
        //this line will execute when none of the able return statement executed, hence target not found
        return -1;
    }
}

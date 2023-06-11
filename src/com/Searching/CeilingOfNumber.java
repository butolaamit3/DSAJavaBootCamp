package com.Searching;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(ceiling(arr,17));
    }
    public static int ceiling(int[] arr, int target){ // return smallest number index that is greater or = to target
        int start = 0;
        int end = arr.length-1;
//        what if the target element is the greatest element of the array
        if(target>arr[arr.length-1]){
            return -1;
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        //if target does not found that means while loop violated so the ans is end
        return start;
    }
}

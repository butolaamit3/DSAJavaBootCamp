package com.Searching;

public class FloreOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(flore(arr,1));

    }
    public static int flore(int[] arr, int target){ // return greatest number index that is smaller or = to target
        int start = 0;
        int end = arr.length-1;
        //        what if the target element is the smallest element of the array
        if(target<arr[0]){
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
        return end;
    }
}

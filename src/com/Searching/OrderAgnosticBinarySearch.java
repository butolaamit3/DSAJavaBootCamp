package com.Searching;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,3,5,7,9,12,17,24,29,31,37,45};
//        int[] arr = {45,41,40,32,30,29,27,26,21,19,3,3};

        System.out.println(orderAgnosticBinarySearch(arr,99));
    }

    private static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        //find whether the array is sorted in ascending or descending order
        boolean isAcs = arr[start]<arr[end];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAcs){
                if(target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }

            }
        }
        return -1;
    }
}

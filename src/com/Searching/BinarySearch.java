package com.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        System.out.println(binarySearch(arr,48));

    }
//    return the index
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            //find the middle element
//            int mid = (start+end)/2; //what if start+end exceed the limit of integer
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }
            else {
                //return ans
                return mid;
            }
        }
        //if target not found
        return -1;
    }
}

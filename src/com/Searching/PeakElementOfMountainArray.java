//852. Peak Index in a Mountain Array
//Input: arr = [0,1,0]
//        Output: 1
package com.Searching;

public class PeakElementOfMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));

    }
    //this function return the peak index
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

//         let the initial max is at index 0
        int max = arr[0];
        while(start<end){
            int mid = start+(end-start)/2;

//          if the element at mid is greater than mid+1 the we are in                 decreasing orede array
            if(arr[mid]>arr[mid+1]){

//          new max is mid but there is also possibilities that                       max is also in the left
                max = mid;

//              the new end is mid and start is same
                end = mid;
            }
            else{
//                 if element in mid is smaller than mid+1 then new start is mid+1                      and end remail same
                start = mid+1;
            }
        }
        return max;

    }
}

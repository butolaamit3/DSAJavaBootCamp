//Find position of an element in a sorted array of infinite numbers
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

package com.Searching;
public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,99,100,130,140,160,170};
        System.out.println(ans(arr,10));

    }
    static int ans(int[] arr, int target){
        //search With the chunk of size two
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int temp = end+1;
            //newEnd = previous end + sizeOfBox*2;
            end = end+(end-start+1)*2;
            start  = temp;
        }
        return searchInChunks(arr,target,start,end);

    }
    public static int searchInChunks(int[] arr, int target, int start, int end){
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

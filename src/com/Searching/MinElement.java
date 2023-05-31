package com.Searching;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {34,65,2,9,4};
        System.out.println(min(arr));
    }

    private static int min(int[] arr) {
        //let us assume the min element is at first index
        int ans = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}

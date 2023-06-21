package com.ArraysAndArrayList;

public class MaximumGap {
    public static void main(String[] args) {
        int[] arr = {3,10,9,1,10};
        System.out.println(maximumGap(arr));
    }

    private static int maximumGap(int[] arr) { //brute force
        int start = 0;
        int max = 0;
        if(arr.length==1){
            return 0;
        }
        while(start+1<arr.length){
            int count = 0;
            int diff = arr[start+1]-arr[start];
            count = Math.max(count,diff);
            if(count>max){
                max = count;
            }
            start++;
        }
        return max;
    }
}

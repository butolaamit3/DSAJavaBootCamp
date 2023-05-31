//1295. Find Numbers with Even Number of Digits
//Given an array nums of integers, return how many of them contain an even number of digits.
//Input: nums = [12,345,2,6,7896]
//        Output: 2
//        Explanation:
//        12 contains 2 digits (even number of digits).
//        345 contains 3 digits (odd number of digits).
//        2 contains 1 digit (odd number of digits).
//        6 contains 1 digit (odd number of digits).
//        7896 contains 4 digits (even number of digits).
//        Therefore, only 12 and 7896 contain an even number of digits.

package com.ArraysAndArrayList;
public class DigitInNumber {
    public static void main(String[] args) {
        int [] arr = {0};
        System.out.println(findNumber(arr));
    }

    private static int findNumber(int[] arr) {
        int sum = 0;
        if(arr.length==0||(arr.length==1&&arr[0]==0)){ // edge case
            return 0;
        }
        for(int element : arr){
            int count = 0; // reset the cou nt for every number
            while(element>0){
                element = element/10;
                count  = count+1;
            }
            if(count%2==0){
                sum =  sum+1;
            }
        }
        return sum;
    }
}

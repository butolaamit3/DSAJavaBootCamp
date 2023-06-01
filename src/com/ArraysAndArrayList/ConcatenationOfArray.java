package com.ArraysAndArrayList;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(getConcatenation3(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < ans.length; i++) {
            if (i < nums.length) {
                ans[i] = nums[i];
            } else {
                ans[i] = nums[i - nums.length]; // to go to the first element of original array subtract the index with original array length
            }
        }

        return ans;
    }

//other solution to fill the next element at once
    public static int[] getConcatenation1(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i=0;i<nums.length;i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
    public static int[] getConcatenation3(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i=0;i<ans.length;i++) {
            ans[i] = nums[i%nums.length];  //ans[0] = nums[0%3]
        }
        return ans;
    }


}

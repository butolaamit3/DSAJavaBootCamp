package com.sorting.questions;

import java.util.Arrays;

//Que 268 - https://leetcode.com/problems/missing-number/
public class missingNo {
    public static void main(String[] args) {
        int [] nums = {4,0,2,1};
        System.out.println(missingNumber(nums));


    }
    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length&&nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }

        }
        //search for first missing number
        for(int index = 0;index<nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
        }
        //case 2 - means the missing no. is N
        return nums.length;

    }

}

package com.sorting.questions;

import java.util.ArrayList;
import java.util.List;

//Ques - 448 - https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindAllMissingNumber {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;

            }
        }
        //find Missing Number
        List<Integer> ans = new ArrayList<>();
        for(int index = 0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
}

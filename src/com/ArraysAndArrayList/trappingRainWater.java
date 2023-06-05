//42. Trapping Rain Water
// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//        Output: 6
//        Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
//        In this case, 6 units of rain water (blue section) are being trapped.
package com.ArraysAndArrayList;
public class trappingRainWater {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(waterSum1(height));
    }

    private static int waterSum(int[] height) {
        int n = height.length;
        int leftMax = 0;
        int rightMax = 0;
        int left = 0;
        int right = n-1;
        int ans = 0;
        while(left<=right){
            if(height[left]<=height[right]){
                leftMax = Math.max(height[left], leftMax);
                ans+= (leftMax - height[left]);
                left++;
            }else{
                rightMax = Math.max(height[right], rightMax);
                ans+= (rightMax - height[right]);
                right--;
            }
        }
        return ans;
    }
    private static int waterSum1(int[] height){
        int left = 0, right = height.length - 1;
        int leftMax = height[0], rightMax = height[height.length - 1];
        int water = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                if (leftMax < height[left]) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
            } else {
                right--;
                if (rightMax < height[right]) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
            }
        }
        return water;
    }

}

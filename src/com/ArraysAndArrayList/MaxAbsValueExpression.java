//1131. Maximum of Absolute Value Expression
//Given two arrays of integers with equal lengths, return the maximum value of:
//        |arr1[i] - arr1[j]| + |arr2[i] - arr2[j]| + |i - j|
//        where the maximum is taken over all 0 <= i, j < arr1.length.
//Input: arr1 = [1,2,3,4], arr2 = [-1,4,5,6]
//        Output: 13

package com.ArraysAndArrayList;
public class MaxAbsValueExpression {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {0,-2,-1,-7,-4};
        System.out.println(maxAbsValExpr(arr1,arr2));

    }
    public static int maxAbsValExpr(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] a = new int[n]; //store si+Ti +i
        int[] b = new int[n]; //store si+Ti -i
        int[] c = new int[n]; //store si-Ti +i
        int[] d = new int[n]; //store si-Ti -i

        for (int i = 0; i < n; i++) {
            int si = arr1[i];
            int ti = arr2[i];
            a[i] = si+ti+i;
            b[i] = si+ti-i;
            c[i] = si-ti+i;
            d[i] = si-ti-i;

        }
        int ans1= findDiffOfMaxMin(a);
        int ans2= findDiffOfMaxMin(b);
        int ans3= findDiffOfMaxMin(c);
        int ans4= findDiffOfMaxMin(d);
        return Math.max(Math.max(ans1,ans2),Math.max(ans3,ans4));

    }

    private static int findDiffOfMaxMin(int[] x) {
        int n = x.length;
        int maxEle = x[0];
        int minEle = x[0];
        for (int i = 0; i <n ; i++) {
            minEle = Math.min(minEle,x[i]);
            maxEle = Math.max(maxEle,x[i]);
        }
        return maxEle-minEle;
    }

}

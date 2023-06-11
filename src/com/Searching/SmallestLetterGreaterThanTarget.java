//744. Find Smallest Letter Greater Than Target
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 package com.Searching;
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letter = {'c','f','j'};
        System.out.println(nextGreatestLetter(letter,'f'));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<letters[mid]){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return letters[start%letters.length];
    }
}

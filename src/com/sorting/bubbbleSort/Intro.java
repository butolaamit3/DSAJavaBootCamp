package com.sorting.bubbbleSort;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
//        int [] arr = {3,1,1,5,2,8};
//        int[] arr ={1,2,3,4,5,6};
        int[] arr= {-5,-1,-7,4,3,8,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i <arr.length ; i++) { //run the loop n-1 times
            swapped = false;
            //for each step,max item will come at the last respective index
            for (int j = 1; j <arr.length-i ; j++) {
                 //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

            }
            //if you did not swap for a particular value of i, that means the array is sorted hence stop the program
            if(!swapped){
                break;
            }
        }

    }
}

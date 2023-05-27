package com.ArraysAndArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PassingArrayInFunction {
    public static void main(String[] args) {
        int[] arr  = {4,2,43,77,3};
        System.out.println(Arrays.toString(arr));
        modifyArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void modifyArray(int[] arr) { // arrays are mutable
        arr[2] = 9;// this will change the original object it is pointing to the same object
    }
}

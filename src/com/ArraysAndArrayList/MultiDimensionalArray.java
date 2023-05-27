package com.ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
//        int [][] arr = new int[3][3]; //if you want you can initialize the size first
//        int[][] arr1 = {   //or you can directly allocate the value
//                {1,3,2,},
//                {9,4,3},
//                {2,5,7}
//        };

//        You can initialize 2D array without giving the size of the column

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of the array : ");
//        int[][] a = new int[3][];
//        int[][] b = {
//                {1,2,3}, //0th index
//                {3,2}, //1st index
//                {1,2,3,4,5} //2nd index =>arr[2] = [1,2,3,4,5]
//        };
        //input
        int[][] arr2 = new int[3][3];
//        System.out.println(arr2.length); //it prints the length of row -> 3
        for (int row = 0; row <arr2.length ; row++) { //for each row
            for (int col = 0; col <arr2[row].length  ; col++) { //for each col
                arr2[row][col] = sc.nextInt();
                
            }
        }
        //to print
        for (int row = 0; row <arr2.length ; row++) { //for each row
            for (int col = 0; col <arr2[row].length  ; col++) { //for each col
                System.out.print(arr2[row][col]+" ");
            }
            System.out.println();
        }
        //other way to print
        for(int i = 0;i< arr2.length;i++){
            System.out.print(Arrays.toString(arr2[i]));
            System.out.println();
        }
        
        //other way
        for (int[] a:arr2){ // because every single element is itself is an array
            System.out.print(Arrays.toString(a));
            System.out.println();
        }



    }
}

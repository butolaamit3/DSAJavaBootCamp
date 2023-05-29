//1572. Matrix Diagonal Sum

//Given a square matrix mat, return the sum of the matrix diagonals.Only include the sum of
// all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
//Input: mat = [[1,2,3],
//        [4,5,6],
//        [7,8,9]]
//        Output: 25
//        Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
//        Notice that element mat[1][1] = 5 is counted only once.

package com.ArraysAndArrayList;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i<mat.length){ //till number of rows and colm
            if(i!=(n-1)-i){
                sum = sum+mat[i][(n-1)-i];
            }
            sum = sum+mat[i++][j++]; // for primary diagonal, we are checking primary diagonal after secondary because here we are increasing the value of I and J
        }
        return sum;

    }
}

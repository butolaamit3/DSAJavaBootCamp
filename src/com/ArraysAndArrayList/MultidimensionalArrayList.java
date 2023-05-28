package com.ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultidimensionalArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); //List of List

        //Initialisation // first you have to add list inside other list then you able to add element on that list
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //Adding element
        System.out.println("Enter the elements : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                list.get(i).add(sc.nextInt());
            }

        }
        System.out.println(list);
    }
}

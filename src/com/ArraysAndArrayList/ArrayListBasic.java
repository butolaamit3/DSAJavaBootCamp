package com.ArraysAndArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(3); // No matter what is your ArrayList initial Capacity you can add as many as you want
//        list.add(34);
//        list.add(12);
//        list.add(35);
//        list.add(94);
//        System.out.println(list.contains(94));
//        System.out.println(list);
//        list.set(0,99);
//        list.remove(0);
//        System.out.println(list);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements : ");
        for (int i = 0; i <5 ; i++) {
            list.add(sc.nextInt());
            
        }
        for (int i = 0; i <5 ; i++) {
            System.out.print(list.get(i)+" ");// Pass index here; ist[index] will not work here

        }
        //or you can directly print the list
        System.out.println(list);


    }
}

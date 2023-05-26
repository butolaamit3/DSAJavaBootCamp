package com.methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();

    }
    static void sum(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}

package com.basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i = 2;i<=n;i++){
            sum = a+b;
            a = b;
            b = sum;

        }
        System.out.println(sum);

    }
}

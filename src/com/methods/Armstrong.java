package com.methods;

import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");


        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
    }

    public static boolean isArmstrong(int n) {
        int sum = 0;
        int a = n;
        while(n>0){
            int rem = n%10;
            sum = sum+(rem*rem*rem);
            n = n/10;
        }
        return a==sum;
    }
}

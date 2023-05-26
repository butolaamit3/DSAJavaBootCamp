package com.basic;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverse(num));
    }
//    Reverse a number
    public static int reverse(int num){
        int ans = 0;

        while(num>0){
            int rem = num%10;
            ans = ans*10+rem;
            num = num/10;

        }
        return ans;

    }
}

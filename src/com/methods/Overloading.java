package com.methods;

public class Overloading {
    public static void main(String[] args) {
        System.out.println(sum(9,2));
        System.out.println(sum(3,6,9));
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
}

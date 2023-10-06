package com.function_methods;

public class Shadowing {
    static int x = 90; // this will be shadowed at line no 9

    public static void main(String[] args) {
        System.out.println(x); //90
        int x = 40;
        System.out.println(x); //40, because the variable with the higher level of scope is hidden
        fun();

    }
    static void fun(){
        System.out.println(x);

    }
}

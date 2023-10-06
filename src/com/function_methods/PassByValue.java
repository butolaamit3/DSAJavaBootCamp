package com.function_methods;

public class PassByValue {
    public static void main(String[] args) {
        String name = "Amit";
        greet(name);
        System.out.println(name);
        int a = 4;
        int b = 5;
        swap(a,b);
        System.out.println(a+" "+b);
    }

    static void swap(int a, int b) {
         int temp = a;
         a = b;
         b = temp;
    }

    static void greet(String name) {
        name = "Kunal"; //creating a new object

    }
}

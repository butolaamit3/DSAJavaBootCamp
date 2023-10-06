package com.function_methods;

public class Scoping {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        a=8;
        {
//            int a = 5;//already initialize outside the block so can not initialize the value again
            a = 89; // but you can change the value
            int c = 45; // value initialize inside the block will always remain inside the block, Reassign the original ref variable to some other value
            System.out.println(a);
        }
        System.out.println(a); //it will print modified value
//        System.out.println(c); // you are not able to print the value of  c outside the b;
    }
}

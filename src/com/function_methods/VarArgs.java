package com.function_methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,7,8,8,9,14);
        multiple(4,5,"Amit","Kunal");

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
//    static void multiple1(int d,String ...c, int b) { //Variable length argument is always comes at the end you can not assign it in between two int or two sting whatever
//    }
    static void multiple(int a,int b, String ...c){
        System.out.println();
    }
}

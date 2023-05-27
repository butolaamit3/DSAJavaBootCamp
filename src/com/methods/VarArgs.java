package com.methods;

public class VarArgs {
    public static void main(String[] args) {
        int b = sum(1,2,3);
        System.out.println(b);

    }
    static int sum(int ...args){
        int sum = 0;

        for(int i : args){
            sum +=i ;
        }
        return sum;

    }
}

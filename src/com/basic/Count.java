package com.basic;

//13839 how many times 3 occur
public class Count {
    public static void main(String[] args) {
        int a = 1383393;
        int count = 0;
        while(a>0){
            int rem = a%10;
            if(rem==3){
                count++;
            }
            a = a/10;
        }
        System.out.println(count);

    }
}

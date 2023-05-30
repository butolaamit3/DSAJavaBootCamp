package com.Searching;
import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Amit";
        System.out.println(search(name,'t'));
        System.out.println(search2(name,'A'));
        System.out.println(Arrays.toString(name.toCharArray()));// to print the character array
    }

    public static boolean search(String str, char target) {
         if(str.length()==0){
             return false;
         }
        for (int index = 0; index <str.length() ; index++) {
            if(str.charAt(index)== target){
                return true;
            }

        }
        return false;

    }

    public static boolean search2(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(char a : str.toCharArray()){
            if(a==target){
                return true;
            }
        }
        return false;
    }
}

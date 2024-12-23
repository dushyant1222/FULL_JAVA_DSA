package com.Searching.LinearSearch;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Dushyant";
        char target = 's';
//        System.out.println(NameSearch(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    public static boolean NameSearch(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch: str.toCharArray()){
            if(target == ch){
                return true;
            }
        }
//        for (int i = 0; i < str.length(); i++) {
//            if(target == str.charAt(i)){
//                return true;
//            }
//        }
        return false;
    }
}

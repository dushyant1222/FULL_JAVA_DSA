package com.Searching.LinearSearch;

public class Main {

    static int LinearSearch(int [] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {12,4,56,43,11,7,87};
        int target =11;
        System.out.println(LinearSearch(nums,target));
    }
}

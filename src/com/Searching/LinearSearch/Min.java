package com.Searching.LinearSearch;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Min {
    public static void main(String[] args) {
        int [] arr = {12,5,34,33,88,9,32,45,1};
        System.out.println(Min(arr));
    }

    static int Min(int @NotNull [] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}

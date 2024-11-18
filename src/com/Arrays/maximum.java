package com.Arrays;

import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,22,5,66,9,3,9};
        System.out.println(max(arr));
    }

    // we take the first ele as the max val and then compare it till the array length
    static int max(int []arr){
        int maxval = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}

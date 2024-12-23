package com.Searching.LinearSearch;

import java.util.Arrays;

public class Searchin2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,8},
                {45,43,32},
                {76,78,4,22}
        };
        int target = 78;
        int [] ans = Search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[] {row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

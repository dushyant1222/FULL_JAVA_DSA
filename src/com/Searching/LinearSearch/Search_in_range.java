package com.Searching.LinearSearch;

import java.util.Scanner;

public class Search_in_range {
    public static boolean LinearSearchRange(int arr[], int target, int start, int end){
        for (int i = start; i <= end ; i++) {
            if(target == arr[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {12,43,6,22,88,54,23,98};
        int target = 23;
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(LinearSearchRange(arr, target, start, end));
    }
}

package com.Conditionals_and_loops.ASSIGNMENTS.Intemediate;

import java.util.Scanner;

public class AverageQ3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter how many numbers to calculate the average");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " +n+ " Numbers");
        for(int i =0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        int res =0;
        for(int i= 0; i<n; i++){
            res = res + arr[i];
        }
        System.out.println(res/n);
    }
}

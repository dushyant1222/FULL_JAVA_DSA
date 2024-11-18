package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int[5];
        //Taking the input using the for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
      }
        //First method to print is simple for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //seocnd method to print the array is the for each loop
        for(int num: arr){
            System.out.print(num + " ");
        }
        //thirrd method to print the array is the tostring() method which we are going to use the most
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[5]); //Index out of bound error
    }
}

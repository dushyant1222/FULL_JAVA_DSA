package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        1, 2, 3
        4, 5, 6
        7, 8, 9
        */
        //Syntax:
//         int[][] arr1 = new int[3][];

        //if we want to enter directly then enter like this:
        var arr1 = new int[][]{
                {1, 2, 3}, //0th index
                {4, 5, 6}, //1st index
                {7, 8, 9} //2nd index
        };

        //we can take the 2d array of different size
        var arr2D = new int[][]{
                {1, 2, 3}, //0th index
                {4, 5}, //1st index
                {6, 7, 8, 9} //2nd index -> arr2D[2]= {6,7,8,9}
        };
            int [][] arr = new int[3][3];
        //input
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        //output
//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+ " ");
//            }
//            System.out.println(); //after every row it prints the new line
//        }
        /* This above code for output is not the good way for the output, we can use the tostring() method here */

        //Below is the convenient way for the output
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        //we can also use the enhanced for loop
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}

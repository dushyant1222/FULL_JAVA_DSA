package com.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        //Store 5 roll no:
        //normally
        int rollno1 = 23;
        int rollno2 = 32;
        int rollno3 = 77;
        //..........

        //What if you have to take 100 rollno ?
        //Here array is useful
        //Syntax:- datatype [] variable name = new datatype[size];
        int[] arr = new int[10];
        //OR
        int [] arr1 = {32,23,45,12,62};
        int [] arr2; //decleration - define in the stack
        arr2 = new int[10]; //Initialization - here obj is created in the heap memory

        //If you do indexing then the by default value here in java is 0
        System.out.println(arr2[0]);
        System.out.println(arr1[0]);

        String [] str = new String[5];
        System.out.println(str[0]); // It will give the null in java and None in python

        //null is a literal you cannot use it as dtype or var


    }
}

package com.Datatypes;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number");
        n = in.nextInt();
        if (n%2==0){
            System.out.println("This is an even number");
        }
        else {
            System.out.println("This is an odd number");
        }
    }
}

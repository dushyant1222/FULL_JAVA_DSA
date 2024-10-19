package com.Functions_Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();
//        int sum2 = sum2();
//        System.out.println(sum2);
        int sm3 = sum3(20,44);
        System.out.println(sm3);
    }
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }

    // return type
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        return a+b;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        int sum = a+b;
        System.out.print("The sum is: "+sum);
    }
}

package com.dushyant;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        float num1, num2, sum;
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum = num1 + num2;
        System.out.println("The sum is: "+ sum);
    }
}

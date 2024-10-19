package com.Datatypes;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        float num1, num2;
        char opr;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = in.nextFloat();
        System.out.print("Enter the second number: ");
        num2 = in.nextFloat();
        System.out.print("Enter the operator(+,-,*,/): ");
        opr = in.next().charAt(0);
        if (opr == '+') {
            System.out.println("The sum of the " + num1 + " and" + num2 + " is: " + (num1 + num2));
        } else if (opr == '-') {
            float result = num1 - num2;
            System.out.println("The difference of " + num1 + " and" + num2 + " is: " + result);
        } else if (opr == '*') {
            System.out.println("The multiplication of " + num1 + " and" + num2 + " is: " + (num1 * num2));
        } else if (opr == '/') {
            System.out.println("The division of " + num1 + " and" + num2 + " is: " + (num1 / num2));
        } else{
            System.out.println("Enter the valid operator");
        }
    }
}

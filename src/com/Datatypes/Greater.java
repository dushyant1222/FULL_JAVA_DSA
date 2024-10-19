package com.Datatypes;

import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        float num1,num2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = in.nextFloat();
        System.out.print("Enter the second number: ");
        num2 = in.nextFloat();
        if(num1 > num2){
            System.out.println(+num1+ " is Greater");
        }
        else{
            System.out.println(+num2+ " is Greater");
        }
    }
}

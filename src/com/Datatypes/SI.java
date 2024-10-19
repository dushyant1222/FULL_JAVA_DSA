package com.Datatypes;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        float P,R,T,SimpleInterest;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        P = in.nextFloat();
        System.out.print("Enter the time in years: ");
        T = in.nextFloat();
        System.out.print("Enter the rate of Interest: ");
        R = in.nextFloat();
        SimpleInterest = (P*R*T)/100;
        System.out.println("The simple Interest is: " + SimpleInterest);
    }
}

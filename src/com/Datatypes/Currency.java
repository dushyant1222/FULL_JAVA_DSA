package com.Datatypes;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        float inr;
        double usd;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount in rupees: ");
        inr = in.nextFloat();
        usd = 1/83.52*inr;
        System.out.println("The amount in usd is: " +usd);
    }
}

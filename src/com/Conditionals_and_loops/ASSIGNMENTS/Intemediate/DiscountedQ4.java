package com.Conditionals_and_loops.ASSIGNMENTS.Intemediate;

import java.util.Scanner;

public class DiscountedQ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marketPrice: ");
        int mp = in.nextInt();
        System.out.println("Enter the discount: ");
        int dis = in.nextInt();
        int s = 100-dis;
        int amount = (s*mp)/100;
        System.out.println("Amount afer discount is: " + amount);
    }
}

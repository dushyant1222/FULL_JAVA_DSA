package com.Conditionals_and_loops.ASSIGNMENTS.Intemediate;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of x1 & x2 coordinates: ");
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        System.out.println("Enter the value of y1 & y2 coordinates: ");
        int y1 = in.nextInt();
        int y2 = in.nextInt();
        int d = (int) Math.sqrt((x2-x1)^2 + (y2-y1)^2);
        System.out.println(d);
    }
}

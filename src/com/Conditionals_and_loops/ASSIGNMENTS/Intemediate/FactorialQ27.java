package com.Conditionals_and_loops.ASSIGNMENTS.Intemediate;

import java.util.Scanner;

public class FactorialQ27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fact = 1;
        for(int i = 1;i<=n;i++){
           fact *=i;
        }
        System.out.println(fact);
    }
}
package com.Conditionals_and_loops;

import java.util.Scanner;

public class CountingOccuerence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 45987454;
        int x = 25 - 5 * 4 / 2 - 10 + 4;
        System.out.println(x);

        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if(rem == 4){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}

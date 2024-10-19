package com.Conditionals_and_loops.ASSIGNMENTS.Basic;

import java.util.Scanner;

public class EntersZeroQ24 {
    public static void main(String[] args) {
        EntersZeroQ24 Zero = new EntersZeroQ24();
        Zero.Zero();
    }
    public void Zero(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        int result =0;
        while(n>0) {
            if (n > 0) {
                result = result + n;
            }
            else{
                System.out.println("No data is given");
            }
           n = in.nextInt();
        }
        System.out.println(result);
    }
}

package com.Conditionals_and_loops.ASSIGNMENTS.Basic;
import java.util.*;
public class LargestZeroQ25 {
    public static void main(String[] args) {
        LargestZeroQ25 Zero = new LargestZeroQ25();
        Zero.Zero25();
    }
    public void Zero25(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        int largestno = Integer.MIN_VALUE;
        while(n>0) {
            if (n>largestno) {
                largestno = n;
            }
            else{
                System.out.println("No data is given");
            }
            n = in.nextInt();
        }
        System.out.println("The largest number of all is: "+largestno);
    }
}


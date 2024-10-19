package com.Functions_Methods;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean ans = isPrime(n);
//        System.out.println(ans);
//        boolean a = arm(n);
//        System.out.println(a);
        for (int i =100; i<1000;i++){
            if(arm(i)){
                System.out.println(i);
            }
        }

    }
    static Boolean arm(int n){
        int org = n;
        int sum = 0;
        while(n>0){
           int rem = n%10;
            n = n/10;
            sum += rem*rem*rem;
        }
        return sum == org;

    }
    static Boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c <=n){
            if(n % c ==0){
                return false;
            }
            c++;
        }
        return c*c >n;
    }
}

package com.dushyant;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        System.out.println(num);

        //Type casting
        int num = (int)(67.66f);
//        System.out.println(num);

        // Automatic type promotion in expressions
//        int a = 260;
//        byte b = (byte)(a);  // 260 % 256 = 4

//        System.out.println(b);

//        byte a = 30;
//        byte b = 40;
//        byte c = 100;
//        int d = a*b / c;
//        System.out.println(d);

//        byte b = 50;
//        b =  b * 2; // it gives error

//          int n = '2';
//        System.out.println(n);

        byte b = 44;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 88.99f;
        double d = 873258773832.989;
        double result = (f*b) + (i/c) + (d*s);
        System.out.println((f*b) + " " + (i/c) + " " + (d*s));
        System.out.println(result);

    }
}

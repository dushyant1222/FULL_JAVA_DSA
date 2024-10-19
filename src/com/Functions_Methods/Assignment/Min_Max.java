package com.Functions_Methods.Assignment;

import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();
        int Largest = Largest(first, second, third);
        int smallest = Smallest(first, second, third);
        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n", first, second, third, largest);
        System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", first, second, third, smallest);
    }
    public static int Largest(int first,int second,int third){
        int max = first;
        if(second > max){
            max = second;
        }
        if (third > max){
            max = third;
        }
        return max;
    }
    public static int Smallest(int first, int second, int third){
        int min = first;
        if (second < min){
            min = second;
        }
        if (third < min){
            min = third;
        }
        return min;
    }

}

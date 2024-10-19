package com.Datatypes;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = in.nextLine();
        System.out.println("Hello " + name +  " Welcome to Java hehe");
    }
}

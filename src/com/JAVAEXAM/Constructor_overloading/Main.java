package com.JAVAEXAM.Constructor_overloading;

public class Main {
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.id + " default name is "+s.name);
        System.out.println(s.sum(10,"dushyant"));
    }
}

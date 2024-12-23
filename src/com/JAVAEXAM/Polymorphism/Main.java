package com.JAVAEXAM.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.sum(2,3));
        s.sum(3,4,5);
        s.sum(3,1);
    }
}

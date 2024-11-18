package com.Functions_Methods;

public class Overloading {
    public static void main(String[] args) {
        func("Dushyant Dev");
        func(23);
    }
    static void func(int a){
        System.out.println(a);
    }
    static void func(String name){
        System.out.println(name);
    }
}

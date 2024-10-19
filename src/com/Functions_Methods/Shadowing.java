package com.Functions_Methods;

public class Shadowing {
    static int x = 10; //this will shadow to the line 8

    public static void main(String[] args) {
        System.out.println(x);
        int x = 30; //class var at the line 4 is shadowed by this
        System.out.println(x);
        func();
    }
    static void func(){
        System.out.println(x);
    }

}

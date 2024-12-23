package com.JAVAEXAM.Constructor_overloading;

public class Sum {
    int id; String name;
    void sum(){
        System.out.println("this is default constructor");
    }
    int sum(int i, String n){
        id = i;
        name = n;
        return id;
    }
}

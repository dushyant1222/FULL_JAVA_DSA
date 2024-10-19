package com.Functions_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        func(2,56,23,6,12,87,675,34,3,77,33,56);

    }
    static void func(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

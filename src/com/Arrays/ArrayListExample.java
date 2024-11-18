package com.Arrays;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//
//        list.add(832);
//        list.add(5);
//        list.add(5556);
//        list.add(345);
//
//        System.out.println(list);
//        list.set(0,8712787);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
        
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i));
        }
        System.out.println(list);
    }
}

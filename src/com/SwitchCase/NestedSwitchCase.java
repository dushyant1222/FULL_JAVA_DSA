package com.SwitchCase;

import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner  in =  new Scanner(System.in);
        System.out.println("Enter the Employee ID: ");
        int empID = in.nextInt();
        String department = in.next();
        switch (empID) {
            case 1 -> System.out.println("Dushyant Chaudhary");
            case 2 -> System.out.println("Dev  Chaudhary");
            case 3 -> {
                System.out.println("Shivani Chaudhary");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("Enter the correct department");
                }
            }
            default -> System.out.println("Enter the correct empID");
        }
    }
}

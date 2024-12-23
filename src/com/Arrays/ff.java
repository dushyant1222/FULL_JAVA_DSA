package com.Arrays;
import java.util.*;

public class ff {
        public static void main(String[] args) {
            int num = 123;
            ArrayList<Integer> digits = new ArrayList<>();

            while (num > 0) {
                digits.add(num % 10); // Extract last digit
                num /= 10; // Remove last digit
            }

            Collections.reverse(digits); // Reverse the list to get correct order

            System.out.println(digits); // Output: [1, 2, 3]
        }
    }

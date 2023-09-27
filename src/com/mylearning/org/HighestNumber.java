package com.mylearning.org;

import java.util.Arrays;
import java.util.List;

public class HighestNumber {
    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(5, 8, 2, 10, 3, 1, 7);
        
        Integer thirdHighest = elements.stream()
                .sorted((a, b) -> b - a) // Sort in descending order
                .skip(2) // Skip the first two elements
                .findFirst() // Retrieve the first element
                .orElse(null); // Handle the case where there is no third highest element
        
        if (thirdHighest != null) {
            System.out.println("Third highest element: " + thirdHighest);
        } else {
            System.out.println("There is no third highest element.");
        }
    }
}

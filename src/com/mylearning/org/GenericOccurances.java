package com.mylearning.org;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GenericOccurances {

	public static void main(String[] args) {
		
		
		String inputString = "Java is a programming language. Java is used for web development, desktop development, and mobile development.";
        
		Scanner s= new Scanner(System.in);
		String m=s.next();
		
		String stringToSearch = m; // This could be any string

        // Create a Pattern object to match the string to search
        Pattern pattern = Pattern.compile(stringToSearch);

        // Create a Matcher object to search for occurrences of the pattern in the input string
        Matcher matcher = pattern.matcher(inputString);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        System.out.println("The string '" + stringToSearch + "' occurs " + count + " times in the input string.");
		
		
		

	}

}

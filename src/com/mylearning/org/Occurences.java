package com.mylearning.org;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Occurences {

	public static void main(String[] args) {
		
		String s="This is my world.India is my Country.";
		
		 Pattern pattern = Pattern.compile("is");

	        // Create a Matcher object to search for occurrences of the pattern in the input string
	        Matcher matcher = pattern.matcher(s);

	        int count = 0;
	        while (matcher.find()) {
	            count++;
	        }

	        System.out.println("The string 'is' occurs " + count + " times in the input string.");
	}

}




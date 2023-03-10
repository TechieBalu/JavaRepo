package com.mylearning.org;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

	public static void main(String[] args) {

		String inputString = "abc123def456ghi789";
		String pattern = "(\\D+)(\\d+)(\\D+)(\\d+)(\\D+)(\\d+)";
		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);
		// Create a Matcher object
		Matcher m = r.matcher(inputString);
		// Traverse the string using the pattern
		if (m.find()) {
			System.out.println("Group 1: " + m.group(1));
			System.out.println("Group 2: " + m.group(2));
			System.out.println("Group 3: " + m.group(3));
			System.out.println("Group 4: " + m.group(4));
			System.out.println("Group 5: " + m.group(5));
			System.out.println("Group 6: " + m.group(6));
		}

	}

}

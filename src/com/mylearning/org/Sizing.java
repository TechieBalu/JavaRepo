package com.mylearning.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sizing {

	 static void printPermutn(String str, String ans)
	    {
	 List<String> s= new ArrayList();
	        // If string is empty
	        if (str.length() == 0) {
	            System.out.print(ans + " ");
	            return;
	        }
	 
	        for (int i = 0; i < str.length(); i++) {
	 
	            // ith character of str
	            char ch = str.charAt(i);
	 
	            // Rest of the string after excluding
	            // the ith character
	            String ros = str.substring(0, i) +
	                        str.substring(i + 1);
	 
	            
	       
	            // Recursive call
	            printPermutn(ros, ans + ch);
	            
	            s.add(ros);
	            System.out.println(s);
	        }
	    }
	
	
	public static void main(String[] args) {

		String z = "MMSSL";
		String z1 = "SSMML";
		String pattern1 = "^S...L$";

		Pattern r1 = Pattern.compile(pattern1);

		Matcher m1 = r1.matcher(z1);

		if (m1.find()) {

			System.out.println("Got It:" + z1);
		} else {
			System.out.println("Try again:" + z);
		}

		
		
		 String s = "MMSSL";
	        printPermutn(s, "");
		
		
		
		
		
		
		
	}

}

package com.mylearning.org;

import java.util.HashSet;

public class HashSetScenario {

	public static void main(String[] args) {

		HashSet<String> str = new HashSet<>();
		str.add("Apple");
		str.add("Ball");
		str.add("Fall");
		str.add("King");
        str.add("Abs");
		str.add("Duck");
        str.add("Ball");
        
        System.out.println(str);
        
        for (String string : str) {
        	
        	System.out.println(string);
			
		}

	}

}

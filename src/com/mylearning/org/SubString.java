package com.mylearning.org;

public class SubString {

	public static void main(String[] args) {
		
		String s="pple";
		
		if(s.startsWith("a")) {
			
			System.out.println(s);
		}
		else {
			var p=s.length()-1;
			String s1=s.substring(1,p);
			System.out.println(s1);
		}
		
		
	}

}

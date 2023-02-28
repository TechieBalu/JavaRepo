package com.mylearning.org;

public class StringReverse {

	public static void main(String[] args) {
	
		
		String s="Balaji";
		String x="";
		for(int i=s.length()-1;i>=0;i-- ) {
			
			x=x+s.charAt(i);
		}
		
		System.out.println(x);

	}

}

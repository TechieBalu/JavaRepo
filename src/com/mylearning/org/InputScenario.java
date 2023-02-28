package com.mylearning.org;

import java.util.Scanner;

public class InputScenario {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String z=s.next();
		char[] p=z.toCharArray();
		System.out.println(z);
		int l=0;
		l = vowels(z, p, l);
		System.out.println("Vowels in the String:"+l);
		
		
		
		

	}

	private static int vowels(String z, char[] p, int l) {
		for(int i=z.length()-1;i>0;i--) {
			if(p[i]=='a' || p[i]=='e' ||p[i]=='i' || p[i]=='o'||p[i]=='u') {
				l++;
				System.out.println(p[i]);
				
			}
			
		}
		return l;
	}

}

package com.mylearning.org;

import java.util.Scanner;

public class Scanner1 {
	
	
	 public static void main(String[] args) {
	        // create Scanner class object
	        Scanner scan = new Scanner(System.in);

	        // read input
	        System.out.print("Enter Name: ");
	        String name = scan.nextLine();

	        System.out.print("Enter programming langauge: ");
	        String lang = scan.nextLine();

	        System.out.println("Enter 5 other language name:");
	        String str[] = new String[5];
	        for (int i = 0; i < 5; i++) {
	            str[i] = scan.nextLine();
	        }

	        // display
	        System.out.println();
	        System.out.println("Name: " + name);
	        System.out.println("Current programming language: " + lang);
	        System.out.println("Other languages are:");
	        for (int i = 0; i < 5; i++) {
	            System.out.println(str[i]);
	        }
	        scan.close();
	    }
	

}

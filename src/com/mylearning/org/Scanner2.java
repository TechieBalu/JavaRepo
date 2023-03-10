package com.mylearning.org;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		
		
		Scanner s= new Scanner(System.in);
		System.out.println("The First Number entered:");
		int x=s.nextInt();
		System.out.println(x);
		Scanner s1= new Scanner(System.in);
		System.out.println("The second Number entered:");
		int y=s1.nextInt();
		System.out.println(y);
		Scanner s2= new Scanner(System.in);
		System.out.println("Enter your number from 1 to 4:");
		int z=s1.nextInt();
		int num = z;
		switch(num) {
			case 1:
			{
				System.out.println("addition :"+(x+y));
				break;
			}
			case 2:
			{
				System.out.println("Subtraction :"+(x-y));
				break;
			}
			case 3:
			{
				System.out.println("Multiplication :"+(x*y));
				break;
			}
			case 4:
			{
				System.out.println("addition :"+(x/y));
				break;
			}
			
				default:
				{
					System.out.println("Sorry enter numbers from 1 to 4");
				}
			
			
		}
		
		
		
		

	}

}

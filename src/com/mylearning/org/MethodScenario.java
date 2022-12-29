package com.mylearning.org;

public class MethodScenario {
	
	public void greeting() {
		
		System.out.println("Welcome to the Class");
	}
	
	public int multiply(int a,int b) {
		
		System.out.println(a*b);
		
		return a*b;
	}
	
	
	public String wishes(String x) {
		
		System.out.println("hey its "+x);
		
		return "hey "+x;
	}
	
	public static void main(String args[]) {
		
		MethodScenario ms = new MethodScenario();
		ms.greeting();
		ms.multiply(10, 10);
		ms.wishes("Wednesday");
		
		
		
	}

}

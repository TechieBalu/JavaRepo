package com.mylearning.org;

public class MethodsScenario {
	
	
	public static void greeting(String s) {
		
		System.out.println("welcome "+s);
	}
	
	public int multiply(int a,int b) {
		
		System.out.println("Multiplication "+a*b);
		
		return a*b;
	}
	
	

	public static void main(String[] args) {
		
		MethodsScenario ms= new MethodsScenario();
		ms.multiply(12, 56);
		ms.greeting("Tuesday");
		MethodsScenario.greeting("Its Me");
		
		

	}

}

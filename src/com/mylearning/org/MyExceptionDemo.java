package com.mylearning.org;

public class MyExceptionDemo {

	public static void main(String[] args) throws MyCustomException {
		MyCustomException mce = new MyCustomException("Heya");
		
		System.out.println(mce.getMessage());
		
		int a=5;
		if(a<10) {
			
			throw new MyCustomException("Cannot be less than five");
			
		}
		
		
		
	}

}

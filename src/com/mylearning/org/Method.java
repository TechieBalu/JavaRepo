package com.mylearning.org;

public class Method {

	public void subtract(int x,int y) {
		
		int z=x-y;
		
		System.out.println("Value of subtraction is:"+z);
		
	}

	public static void add(int a,int b) {
		
		System.out.println("addition value:"+(a+b));
	}
	
	static int p=77;
	
	
	public static void main(String[] args) {

		Method m= new Method();
		m.subtract(100, 76);
		
		m.add(10, 11);
		
		
		Method.add(200, 30);
		
		System.out.println(p);
		
		
	}

}

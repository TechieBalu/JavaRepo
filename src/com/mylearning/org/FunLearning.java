package com.mylearning.org;

public class FunLearning {
	

	public static void main(String[] args) {
		

		String s="hello";
		String x="hello";
		String y="world";
		String z="hello";
		String s1 = new String("hello");
		//s1.intern();
		
		System.out.println(s==x);//true as both share the same hashcode
		
		System.out.println("new String:"+s1.hashCode());
		System.out.println("test2:"+s==s1);
		
		System.out.println(s.hashCode());
		System.out.println(x.hashCode());
		System.out.println(z.hashCode());
		
		System.out.println(s.equals(x));//value comparision is done
		
		System.out.println("test:"+s.equals(s1));
		
		
		
		
		
	}

}

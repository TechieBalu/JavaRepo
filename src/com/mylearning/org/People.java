package com.mylearning.org;

public class People implements Comparable<People> {

	public String name;
	public People(String name, int age, String country) {
		super();
		this.name = name;
		this.age = age;
		Country = country;
	}
	public int age;
	public String Country;
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", Country=" + Country + "]";
	}
	@Override
	public int compareTo(People o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
	
	
	
}

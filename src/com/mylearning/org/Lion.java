package com.mylearning.org;

public class Lion extends Animal {
	
	int legs;
	String food;
	public static void main(String[] args) {

		
		Animal a= new Animal();
		a.name="Ferocious";
		a.present=10;
		
		Lion l= new Lion();
		l.legs=4;
		l.food="Non Veg";
		l.name="Ferocious";
		l.present=100;
		
		l.animals();
		
		
		System.out.println(l);
		
		
		
	}
	@Override
	public String toString() {
		return "Lion [legs=" + legs + ", food=" + food + ", name=" + name + ", present=" + present + "]";
	}

	
	

}

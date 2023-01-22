package com.mylearning.org;

import java.util.Comparator;

public class PeopleComparator implements Comparator<People> {

	@Override
	public int compare(People p1, People p2) {
		
		System.out.println("inside compare method");
		
		return p1.name.compareTo(p2.name);
	}

	
}

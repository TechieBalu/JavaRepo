package com.mylearning.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PeopleSortScenario {

	public static void main(String[] args) {

		People p1 = new People("Balaji", 40, "India");
		People p2 = new People("Balu", 42, "India");
		People p3 = new People("Lakshya", 8, "USA");
		People p4 = new People("Nihaal", 40, "Germany");
		People p5 = new People("Bindu", 42, "austria");
		People p6 = new People("Radhi", 38, "India");
		
		List<People> l = new ArrayList();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		l.add(p5);
		l.add(p6);
		
		Collections.sort(l,new PeopleComparator());
		
		for(People p:l)
		{
			System.out.println(p);
		}

	}

}

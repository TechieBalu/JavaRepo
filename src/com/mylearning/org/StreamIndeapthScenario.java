package com.mylearning.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


public class StreamIndeapthScenario {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList();
		List<Integer> a11 = new ArrayList();
		al.add(1);
		al.add(12);
		al.add(1234);
		al.add(12345);
		
		
		System.out.println(al.stream().count());
	

	}

}

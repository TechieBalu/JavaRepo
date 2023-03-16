package com.mylearning.org;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MinMaxImpl {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<Integer>();
		arList.add(15);
		arList.add(250);
		arList.add(52);

		// get Stream object
		Stream<Integer> openStream = arList.stream();
		// Configure stream by filtering out required values
		Stream<Integer> fileterdStream = openStream.filter(i -> i >= 20);
		// u can sort on any stream filter or mapped or on normal stream (non filter or
		// non mapped too)
		Integer min = fileterdStream.min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(min);
//		Integer max  = fileterdStream.max((i1, i2) -> i1.compareTo(i2)).get();
//		System.out.println(max);

		System.out.println("Now in single line");

		Integer minValue = arList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(minValue);
		Integer maxValue = arList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(maxValue);
		Integer max = arList.stream().max(Integer::compare).get();
		
		Integer min1 = arList.stream().min(Integer::compare).get();
		
		System.out.println(min1);

		System.out.print(max);

	}

}

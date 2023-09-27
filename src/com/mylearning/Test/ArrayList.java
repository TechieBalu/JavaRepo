package com.mylearning.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayList {
	
	public static void main(String[] args) {
		
		
		List<Integer> l1= Arrays.asList(1,4,6,8,10);
		List<Integer> l2= l1.stream().map(i->i*2).collect(Collectors.toList());
		
		System.out.println(l2);
		
		
		List country = Stream.of(Arrays.asList("Colombia", "Finland", "Greece", "Iceland", "Liberia", "Mali", "Mauritius"), Arrays.asList("Peru", "Serbia", "Singapore", "Turkey", "Uzbekistan", "Yemen", "Zimbabwe", "Greece", "Iceland")).flatMap(List::stream) .collect(Collectors.toList());  
		System.out.println(country);
	}

	

}

package com.mylearning.org;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {

		List<String> s = Arrays.asList("lakshya", "nihaal", "balaji", "bindu");
		List<String> s1 = s.stream().sorted().collect(Collectors.toList());
		System.out.println(s1);
		List<Integer> s2 = Arrays.asList(100, 78, 3, 90, 345);
		List<Integer> s3 = s2.stream().sorted().collect(Collectors.toList());
		System.out.println(s3);
		List<Integer> s4 = Arrays.asList(100, 78, 3, 90, 345, 78, 3);
		List<Integer> s5 = s4.stream().distinct().collect(Collectors.toList());
		System.out.println(s5);
		Integer maxNumber = s4.stream().mapToInt(Integer::intValue).max()
				.orElseThrow(() -> new RuntimeException("List is empty"));
		System.out.println("Max Number:" + maxNumber);
		Optional<String> s6 = s.stream().max(String::compareTo);
		System.out.println(s6);

	}

}

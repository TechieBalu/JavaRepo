package com.mylearning.org;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerDemo {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

		Consumer<Integer> consumer = t -> System.out.println("Printing  : " + t);

		consumer.accept(10);
		list1.stream().forEach(i -> System.out.println("Let's Print:" + i));
		list1.stream().map(t -> t + 10).forEach(t -> System.out.println("Updated by 10:" + t));
		List<Integer> evenNumbers = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers);

	}

}

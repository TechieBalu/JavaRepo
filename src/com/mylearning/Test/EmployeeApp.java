package com.mylearning.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeApp {

	public static void main(String[] args) {

		List<Employee> li = Arrays.asList(

				new Employee(100, "Lakshya", 194000), new Employee(200, "Balaji", 249000),
				new Employee(500, "Bindu", 94000), new Employee(300, "Nihaal", 19000),
				new Employee(250, "Shawn", 234000));

		
		List<Employee> lie = li.stream().filter(e -> e.getSalary() > 200000).collect(Collectors.toList());

		System.out.println(lie);
		
		
		
		
		

		/*
		 * Map<Object, List<Employee>> l1 = li.stream() .collect(Collectors.groupingBy(e
		 * -> e.getSalary() > 200000 && e.getSalary() < 250000));
		 * System.out.println(l1);
		 * 
		 * Map<Integer, List<Employee>> empByEmpno =
		 * li.stream().collect(Collectors.groupingBy(Employee::getEmpno));
		 * 
		 * System.out.println(empByEmpno);
		 * 
		 * List<Employee> sortedPeople =
		 * li.stream().sorted(Comparator.comparingDouble(Employee::getSalary))
		 * .collect(Collectors.toList());
		 * 
		 * System.out.println(sortedPeople);
		 * 
		 * List<Employee> sortedPeople1 =
		 * li.stream().sorted(Comparator.comparing(Employee::getEmpname))
		 * .collect(Collectors.toList());
		 * 
		 * System.out.println(sortedPeople1);
		 */
	}

}

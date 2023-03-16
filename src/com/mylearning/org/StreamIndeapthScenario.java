package com.mylearning.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class StreamIndeapthScenario {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList();
		al.add(1);
		al.add(123);
		al.add(12);
		al.add(345);
		
		System.out.println(al);
		Integer min=al.stream().min(Integer::compare).get();
		System.out.println("Minimum in the List:"+min);
		Integer max=al.stream().max(Integer::compare).get();
		System.out.println("Max in the List:"+max);
		List<Integer> add=al.stream().map(x->x+100).collect(Collectors.toList());
		System.out.println(add);
		Integer maxy=al.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Maximum value in the array list:"+maxy);
		Integer miny=al.stream().max((i1, i2) -> i2.compareTo(i1)).get();
		System.out.println("Minimum value in the array list:"+miny);
		
		List<Integer> az = new ArrayList();
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your First Number:");
		Integer i=s.nextInt();
		az.add(i);
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter your second Number:");
		Integer i1=s1.nextInt();
		az.add(i1);
		Scanner s2= new Scanner(System.in);
		System.out.println("Enter your Third Number:");
		Integer i2=s2.nextInt();
		az.add(i2);
		Scanner s3= new Scanner(System.in);
		System.out.println("Enter your Fourth Number:");
		Integer i3=s3.nextInt();
		az.add(i3);
		System.out.println("*****************************************");
		
		Integer min1=az.stream().min(Integer::compare).get();
		System.out.println("Minimum in the List:"+min1);
		Integer max1=az.stream().max(Integer::compare).get();
		System.out.println("Max in the List:"+max1);
		
		

	}

}

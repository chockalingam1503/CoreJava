package com.training.compareinjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class CompareUsingComparable {

	public static void main(String[] args) {

		List<Student> ar = new ArrayList<Student>();

		ar.add(new Student(111, "Mayank", "london"));
		ar.add(new Student(131, "Anshul", "nyc"));
		ar.add(new Student(121, "Solanki", "jaipur"));
		ar.add(new Student(101, "Aggarwal", "Hongkong"));
		ar.add(new Student(100, "Zelensky", "Hongkong"));
		ar.add(new Student(100, "Zelenskys", "Hongkong"));

		
		Collections.sort(ar);
		
		ar.forEach(System.out::println);
		
//		Collections.sort(ar , new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o2.getName().compareTo (o1.getName());
//			}
//			
//		});
		
		//java 8 syntax
		Collections.sort(ar , (o1,  o2)-> o2.getName().compareTo (o1.getName()));
			
		
		
		System.out.println("sorted from comparater by name");
		ar.forEach(System.out::println);
		
		//java8 streams
		System.out.println("sorted from comparater by name j8 streams");
		ar =ar.stream().sorted((o1,  o2)-> o2.getAddress().compareTo (o1.getAddress())).collect(Collectors.toList());
		
		ar.forEach(System.out::println);
	}

}

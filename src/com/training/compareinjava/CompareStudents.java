package com.training.compareinjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CompareStudents {

	public static void main(String[] args) {

		List<Student> ar = new ArrayList<Student>();

		// Adding entries in above List
		// using add() method
		ar.add(new Student(111, "Mayank", "london"));
		ar.add(new Student(131, "Anshul", "nyc"));
		ar.add(new Student(121, "Solanki", "jaipur"));
		ar.add(new Student(101, "Aggarwal", "Hongkong"));
		ar.add(new Student(100, "Zelensky", "Hongkong"));

		printObjectList(ar);

		System.out.println("after sorting simply using sort , comparable");
		Collections.sort(ar);

		printObjectList(ar);

		System.out.println("after sorting with comparator");
		
		
		Collections.sort(ar, new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				return  o1.getAddress().compareTo(o2.getAddress())>0?1:-1 ;
			}
			

	});
		
		printObjectList(ar);
		
		System.out.println("after sorting with tradtional comparator using roll no");
		
		Collections.sort(ar, new Student());
		
		printObjectList(ar);
		
	//	   Collections.sort(ar, (o1,o2)-> o2.getRollno()  o2.getRollno() );
		
//	ar.stream().sorted((o1, o2) -> o2.getRollno() -o2.getRollno()))).collect(Collectors.toList()));
	
	List<Student> newlist = ar.stream().sorted( ( o1,  o2)-> o2.getRollno()>o1.getRollno()  ? 1:-1   ).collect(Collectors.toList());
		
	printObjectList(newlist);
	
	
	List<Integer>  numberList = new ArrayList<Integer>();
	
	int [] intArray = {5,6,2,33,4,98} ;
	
	for (int i : intArray) {
		numberList.add(i);
	}
	
Collections.sort(numberList );


printObjectList(numberList);

Collections.sort(numberList  , new  Comparator<Integer>() {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}
});


printObjectList(numberList);
	
	
// ar.stream().collect(Collectors.groupingBy(std->std.getName()));
	}
	
	public static void printObjectList(List<?> lst) {
		System.out.println("-----");
		lst.stream().forEach(System.out::println);
	}

}

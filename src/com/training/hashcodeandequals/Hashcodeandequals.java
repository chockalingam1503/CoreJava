package com.training.hashcodeandequals;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashcodeandequals {

public static void main(String[] args) {
	
	Student std1 = new Student(1, "Bharathi");
	Student std2 = new Student(1, "Bharathi");
	
	System.out.println(std1.equals(std2));
//	System.out.println(std1);
//	System.out.println(std2);
	
	
	ArrayList<Student> stdList= new ArrayList<Student>();
	HashSet<Student> stdSet= new HashSet<Student>();
	
	
	stdList.add(std1);
	stdList.add(std2);
	
	System.out.println("array list is below");
	stdList.forEach(std->System.out.println(std));
	stdSet.forEach(std->System.out.println(std.hashCode()));
	
	
	stdSet.add(std1);
	stdSet.add(std2);
	
	
	System.out.println("Hash Set is below");
	stdSet.forEach(std->System.out.println(std));
	stdSet.forEach(std->System.out.println(std.hashCode()));
	
	
}
	
}

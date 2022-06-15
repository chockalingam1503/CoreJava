package com.training.compareinjava;

import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student> {

	int rollno;
	String name, address;

	public Student() {
		
	}
	
	public Student(int rollno, String name, String address) {

		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	public String toString() {

		return this.rollno + " " + this.name + " " + this.address;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

//	@Override
//	public int compareTo(Student std1) {
//
//		return this.getRollno()>std1.getRollno()? 1 :-1;
//		
//	}
	
	@Override
	public int compareTo(Student std2) {

		return (this.getName().compareTo(std2.getName())>0  ? 1: -1); 
		
	}

@Override
public int compare(Student o1, Student o2) {
	return o1.getRollno()>o2.getRollno()? 1 :-1;
}

	

}


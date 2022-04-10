package com.training.hashcodeandequals;

import java.util.Objects;

public class Student {

	// Attributes of a student
	int rollno;
	String name;

	// Constructor
	public Student(int rollno, String name) {

		// This keyword refers to current instance itself
		this.rollno = rollno;
		this.name = name;
	}

//	// Method of Student class
//	// To print student details in main()
	public String toString() {

		// Returning attributes of Student
		return this.rollno + " " + this.name + " ";
	}

@Override
	public int hashCode() {
		return Objects.hash(name, rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollno == other.rollno;
	}

}

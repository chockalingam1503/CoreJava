package com.training.inheritenceproblems;



public class C extends B{
	public void print() {
		super.print();
		System.out.println("i am from C");
		
	}
	
	public static void main(String[] args) {
		C c = new C();
		c.print();
	}
}


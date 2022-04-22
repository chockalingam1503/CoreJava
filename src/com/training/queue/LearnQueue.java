package com.training.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class LearnQueue {

public static void main(String[] args) {
	
	Queue<String> animal2 = new ArrayDeque<>();
	animal2.add("One");
	animal2.add("two");
	animal2.add("three");
	
	System.out.println(animal2);
	
	System.out.println(animal2.peek());
	System.out.println(animal2.poll());
	
	System.out.println(animal2);
	
System.out.println(animal2.remove());
	
	System.out.println(animal2);
}
	
}

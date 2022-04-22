package com.training.learninterface;

public class Psna {

	public static void main(String[] args) {

		College c = new College() {

			@Override
			public void test() {

				System.out.println("i am test");
			}
		};

		College c1 = (() -> System.out.println("test"));
		College c2 = (System.out::println);
		c.test();
		c1.test();
		c2.test();

	}

}

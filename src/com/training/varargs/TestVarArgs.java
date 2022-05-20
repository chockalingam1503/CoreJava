package com.training.varargs;

public class TestVarArgs {
	
	
public static  void testVarArgs (int... numbers) {
	
	System.out.println("different args are ");
	for (int i : numbers) {
		System.out.println(i);
	}
	
}

public static void main(String[] args) {
	testVarArgs(3,7,8,9);
}

}

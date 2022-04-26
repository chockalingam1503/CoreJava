package com.training.boxingandunboxing;

import java.util.ArrayList;

public class BoxingUnboxingAutoboxing {
	
	
	public static void main(String[] args) {
		 // Creating an Integer Object
        // with custom value say it be 10
        Integer i = new Integer(10);
 
        // Unboxing the Object
        int i1 = i;
 
        // Print statements
        System.out.println("Value of i:" + i);
        System.out.println("Value of i1: " + i1);
 
        // Autoboxing of character
        Character gfg = 'a';
 
        // Auto-unboxing of Character
        char ch = gfg;
 
        // Print statements
        System.out.println("Value of ch: " + ch);
        System.out.println(" Value of gfg: " + gfg);
        
        
        int no=6;
        // Creating an empty Arraylist of integer type
        ArrayList<Integer> al = new ArrayList<Integer>();
 
        // Adding the int primitives type values
        // using add() method
        // Autoboxing
        al.add(no);
        al.add(2);
        al.add(24);
 
        // Printing the ArrayList elements
        System.out.println("ArrayList: " + al);
        
////        Primitive type 	Wrapper class
//        boolean 	Boolean
//        byte 	Byte
//        char 	Character
//        float 	Float
//        int 	Integer
//        long 	Long
//        short 	Short
//        double 	Double
	}

}

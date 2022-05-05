package com.training.compareinjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompareUsingComparaTor {

	public static void main(String[] args) {

		String[] cityArray1 = { "chennai", "COimbatore", "Bangalore", "Bangalore" };
		String[] cityArray2 = { "chennai", "COimbatore", "Hyderabad", "Delhi" };
//		cityList1 = Arrays.asList(cityArray1 );
//		cityList2 = Arrays.asList(cityArray2 );

		// above lines throw unsupported operation exception as above line creates a non
		// resizable list hence use the below

		List<String> cityList1 = new ArrayList<String>(Arrays.asList(cityArray1));
		List<String> cityList2 = new ArrayList<String>(Arrays.asList(cityArray2));

		// cityList3=cityList2;
		// cityList3.stream().map(o1-> { if(!(cityList1.contains(o1)))
		// {cityList3.add(o1)} }).forEach(System.out::print);

		cityList2.stream().filter(city -> !(cityList1.contains(city))).forEach(city -> cityList1.add(city));

		System.out.println(cityList1);
		//below code to remove duplicates inside the collection
		System.out.println(cityList1.stream().distinct().collect(Collectors.toList()));
		//System.out.println(cityList1);
		cityList2.add("Kochi");
		cityList1.add("Kochi");

	}

}

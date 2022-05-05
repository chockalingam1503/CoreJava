package com.training.compareinjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compare {
	
	public static void main(String[] args) {
		
		List<String> cityList3 = new ArrayList<String>();
		
		
		String [] cityArray1 ={"chennai", "COimbatore" , "Bangalore" };
		String [] cityArray2 ={"chennai", "COimbatore" , "Hyderabad" , "Delhi" };
//		cityList1 = Arrays.asList(cityArray1 );
//		cityList2 = Arrays.asList(cityArray2 );
		
		//above lines throw unsupported operation exception as above line creates a non resizable listhence use the below
		
		List<String> cityList1 = new ArrayList<String>(Arrays.asList(cityArray1 ));
		List<String> cityList2 = new ArrayList<String>( Arrays.asList(cityArray2 ));
		
		
		
		
		cityList3=cityList2;
		for (String city1 : cityList1) {
			
			if (!(cityList3.contains(city1))) {
				cityList3.add(city1);
			}
			
		}
		
		System.out.println(cityList3);
	}

}

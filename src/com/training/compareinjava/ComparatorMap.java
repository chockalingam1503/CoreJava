package com.training.compareinjava;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ComparatorMap {
	
	
public static void main(String[] args) {
	
	Map<String, Integer> mp = new HashMap<String , Integer>();
	mp.put("Melson", 2);
	mp.put("Wilson", 3);
	mp.put("Zilson", 1);
	
	
	System.out.println(sortMap(mp));
	
	System.out.println(sortMapByValue(mp));
}

public static Map<String , Integer> sortMap(Map<String , Integer> mp) {
	
	
	Map<String, Integer> mp2 = new TreeMap<String , Integer>(new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			
			return o1.compareTo(o2);
		}
		
	});
	mp2.putAll(mp);
	return  mp2 ;

	
}

public static Map<String , Integer> sortMapByValue(Map<String , Integer> mp) {
	
	
	List<Map.Entry<String , Integer>> singleList = mp.entrySet()
	        .stream()
	        .collect(Collectors.toList());
	

	
	Collections.sort(singleList , new Comparator<Map.Entry<String , Integer>>() {

		public int compare(Map.Entry<String , Integer> o1,Map.Entry<String , Integer> o2) {

			
			return o1.getValue()-o2.getValue();
		}

		
		});
	
	 Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
     for (Map.Entry<String, Integer> entry : singleList) {
         sortedMap.put(entry.getKey(), entry.getValue());
     }
		
	
	return  sortedMap ;

	
}



}

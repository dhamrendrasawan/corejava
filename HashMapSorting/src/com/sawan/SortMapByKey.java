package com.sawan;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByKey {

	public static void main(String[] args) {

		Map<String, Integer> ItemToPrice = new HashMap<>(); 
		ItemToPrice.put("Bony Braiva", 1000); 
		ItemToPrice.put("Apple iPhone 6S", 1200);
		ItemToPrice.put("DP Laptop", 700); 
		ItemToPrice.put("Acer HD Monitor", 139); 
		ItemToPrice.put("Camsung Galaxy", 800);
		
		Map<String, Integer> sortedByKey=ItemToPrice.entrySet().stream().sorted(Map.Entry.<String, Integer> comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		System.out.println("mapAscbykey= "+sortedByKey);
		
		Map<String, Integer> sortedDescByKey=ItemToPrice.entrySet().stream().sorted(Map.Entry.<String, Integer> comparingByKey().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		System.out.println("mapDescbykey= "+sortedDescByKey);
	}

}

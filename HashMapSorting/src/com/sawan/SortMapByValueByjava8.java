package com.sawan;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValueByjava8 {

	public static void main(String[] args) {

		// Creating a Map with electoric items and prices 
		Map<String, Integer> ItemToPrice = new HashMap<>(); 
		ItemToPrice.put("Sony Braiva", 1000); 
		ItemToPrice.put("Apple iPhone 6S", 1200);
		ItemToPrice.put("HP Laptop", 700); 
		ItemToPrice.put("Acer HD Monitor", 139); 
		ItemToPrice.put("Samsung Galaxy", 800);
		//System.out.println("unsorted Map: " + ItemToPrice);
		
		// sorting Map by values in ascending order, price here
		//ItemToPrice.entrySet().stream().sorted(Map.Entry.<String, Integer> comparingByValue()).forEach(System.out::println);
		
		// now, let's collect the sorted entries in Map
		Map<String, Integer> sortedByPrice=ItemToPrice.entrySet().stream().
				sorted(Map.Entry.<String,Integer> comparingByValue()).
				collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,LinkedHashMap::new));
		System.out.println("sorted map= "+sortedByPrice);
		//descending order
		// sorting a Map by values in descending order
       
		Map<String, Integer> sortedByValueDesc = ItemToPrice .entrySet().stream().
				sorted(Map.Entry.<String, Integer> comparingByValue().reversed()).
				collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new)); 
		System.out.println("Map sorted by value in descending order: " + sortedByValueDesc);

		
		

	}
}

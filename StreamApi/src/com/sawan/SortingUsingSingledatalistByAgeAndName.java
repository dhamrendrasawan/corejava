package com.sawan;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUsingSingledatalistByAgeAndName {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("John", "Mark", "Robert", "Lucas", "Brandon");
		List<String> ascendinglist1=list.stream().sorted().collect(Collectors.toList());
		System.out.println("ascending order data = "+ascendinglist1);
		
		Iterator i=ascendinglist1.iterator();
		while(i.hasNext())
		{
			System.out.print( i.next()+" ");
			
		}
		//Descending order
		System.out.println("descending order data = ");
		List<String> descendinglist1=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("descending order data = "+ descendinglist1);

	}

}

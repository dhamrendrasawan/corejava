package com.sawan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestTechMahin {

	public static void main(String[] args) {
		
		//get name start with “JA” and print in upper case
		String nameArray[] = new String[] { "Oliver", "Jack", "Harry","Tejack","Elphinston", "Jacob", "Charlie", "James" };
		
		List<String> list=Arrays.asList(nameArray).stream().filter(s->s.startsWith("Ja")).collect(Collectors.toList());
		System.out.println(list);

	}

}

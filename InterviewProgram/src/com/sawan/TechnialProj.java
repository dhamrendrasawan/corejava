package com.sawan;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TechnialProj {

	public static void main(String[] args) {
String s="Lorem has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. Lorem was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum";
		
		String arg[]=s.split(" ");
		List<String> list=Arrays.asList(arg);
		Map<String,Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		
	}

}

package com.sawan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamOccurance {

	public static void main(String[] args) {
		//Input : "this is a test method and it will test your logic"
			//output : {a=1, method=1, test=2, will=1, and=1, this=1, is=1, logic=1, your=1, it=1}

		  String s="this is a test method and it will test your logic";
		String arg[]= s.split(" ");
		
		List<String> list=Arrays.asList(arg);
		Map<String, Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
	}

}

package com.sawan;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNoOccuring {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//[10,20,10,10,30,20]
				//int ar
				List<Integer> list=Arrays.asList(10,20,10,10,30,20);
				Map<Integer,Long> listno=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
				System.out.println("outpot= "+listno);
	}

}

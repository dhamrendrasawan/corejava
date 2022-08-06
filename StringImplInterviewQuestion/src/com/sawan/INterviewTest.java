package com.sawan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//1 2 3 4 5 7 8
public class INterviewTest {

	public static void main(String[] args) {
		Integer a[]={1,5,4,3,1,5,2,4};
		Integer b[]={4,2,5,7,4,2,8};
		//output-//1 2 3 4 5 7 8
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		list.add(Arrays.asList(a));
		list.add(Arrays.asList(b));
		List<Integer> flatmapdata=list.stream().flatMap(l->l.stream()).distinct().collect(Collectors.toList());
		
		System.out.println(flatmapdata.stream().sorted().collect(Collectors.toList()));

		System.out.println(flatmapdata.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
		
	}

}

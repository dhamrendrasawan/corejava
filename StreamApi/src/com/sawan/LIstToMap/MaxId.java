package com.sawan.LIstToMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxId {

	public static void main(String[] args) {
		Employee e1=new Employee(60,"RAMA");
		Employee e2=new Employee(80,"RAM");
		Employee e3=new Employee(100,"RAMESH");
		Integer maxId=Arrays.asList(e1,e2,e3).stream().reduce((a,b)->a.getId()>b.getId()?a.getId():b.getId()).get().getId();
		
		System.out.println(map);

	}

}

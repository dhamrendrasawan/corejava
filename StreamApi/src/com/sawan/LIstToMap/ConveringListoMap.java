package com.sawan.LIstToMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConveringListoMap {

	public static void main(String[] args) {
		
		Employee e1=new Employee(60,"RAMA");
		Employee e2=new Employee(80,"RAM");
		Employee e3=new Employee(100,"RAMESH");
		
		List<Employee> list=Arrays.asList(e1,e2,e3);
		Map<Integer,String> map=list.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
		System.out.println(map);

	}

}

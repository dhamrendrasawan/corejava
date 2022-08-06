package com.sawan;

import java.util.HashMap;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {

        String s = "{[({[]})]}";
        
		Employee emp1=new Employee(12,"Martin",27);
		Map<Employee,String> hm=new HashMap<Employee,String>();
		hm.put(emp1, "Verified");
		emp1.setName("John");
		System.out.println(hm.get(emp1));
	}

}

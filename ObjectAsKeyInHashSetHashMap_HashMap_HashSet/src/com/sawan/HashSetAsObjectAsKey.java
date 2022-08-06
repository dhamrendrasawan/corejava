package com.sawan;

import java.util.HashSet;
import java.util.Set;

public class HashSetAsObjectAsKey {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("John", 20);
        Employee e2 = new Employee("John", 20); 
        
        Set<Employee> employees = new HashSet<>();
        employees.add(e1);
        employees.add(e2); 
        System.out.println(employees);
        
        int count=employees.size();
        System.out.println("count= "+count);
        
        employees.remove(e2);
        System.out.println("count= "+employees.size());
        System.out.println("value of set= "+employees);


        
	}

}

package com.sawan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapUserObjectKeyDemo {

	public static void main(String[] args) {
	
		EmployeeHashMap emp1=new EmployeeHashMap(101,"Siva");
		EmployeeHashMap emp2=new EmployeeHashMap(102,"Siva");
		EmployeeHashMap emp3=new EmployeeHashMap(101,"Siva");
		
		HashMap<EmployeeHashMap,String> empHashMap=new HashMap<>();
		empHashMap.put(emp1, "User1");  
		empHashMap.put(emp2, "User2");  
		empHashMap.put(emp3, "User3");  
		System.out.println("hashmap data= "+empHashMap.get(emp3)+" size= "+empHashMap.size());
		empHashMap.remove(emp3);
		
		System.out.println("after removing hashmap data= "+empHashMap+" size= "+empHashMap.size());

		for(Map.Entry<EmployeeHashMap, String> entry:empHashMap.entrySet())
		{
			System.out.println(entry.getKey()+ " === "+ entry.getValue());
		}
		//using iterator
	    Set set=empHashMap.keySet();
	    Iterator itr=set.iterator();
	    while(itr.hasNext())
	    {
	    	Object key=itr.next();
	    	System.out.println("key= "+key);
	    	Object value=empHashMap.get(key);
	    	System.out.println("value= "+value);
	    }
		
	}

}

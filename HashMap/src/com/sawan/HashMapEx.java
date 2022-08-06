package com.sawan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<Integer, Double> hm=new HashMap();
		System.out.println("Content of hm="+hm); // { }   
		System.out.println("size of hm="+hm.size());// 0
//add the data to hm---map CFW obj
		hm.put(10,1.2);
		hm.put(40,3.2);
		hm.put(30,4.2);
		hm.put(25,4.8);
		hm.put(28,2.2);
		hm.put(2,2.2);//
		hm.put(119,2.2);
		hm.put(129,2.2);
		hm.put(19,2.2);
		hm.put(139,2.2);
		hm.put(149,2.2);
		hm.put(159,2.2);//12
		hm.put(169,2.2);
		hm.put(179,2.2);
		System.out.println("Content of hm="+hm); // { }   
		System.out.println("size of hm="+hm.size());// 0
//extract the data from hm
		System.out.println("-----------------------------------------------------");
		System.out.println("Content of hm");
		System.out.println("-----------------------------------------------------");
		Set s=hm.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{	Object kobj=itr.next();
			Object vobj=hm.get(kobj);
			System.out.println(vobj+" is the bal of "+kobj);
		}
		System.out.println("-----------------------------------------------------");


	}

}

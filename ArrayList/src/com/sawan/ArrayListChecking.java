package com.sawan;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListChecking {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Ram");
		list.add("Sawan");
		list.add("DK");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			String value=itr.next();
			if(value.equals("Ram"))
			{
				list.remove(0);
			}
		}
		
}
}

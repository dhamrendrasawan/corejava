package com.sawan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SortHashMapByKeysExample {

	public static void main(String[] args) {

		//create a new HashMap
        HashMap<Integer, String> hMapNumbers = new HashMap<Integer, String>();        
       /* hMapNumbers.put(new Integer(2), "Two");
        
        hMapNumbers.put(new Integer(4), "Four");
        hMapNumbers.put(new Integer(3), "Three");        
        hMapNumbers.put(new Integer(1), "One");*/
        
         hMapNumbers.put(2, "Two");
        
        hMapNumbers.put(4, "Four");
        hMapNumbers.put(3, "Three");
        hMapNumbers.put(1, "One");
        
        
       /* System.out.println("HashMap contains...");
        for(Integer key : hMapNumbers.keySet())
        {
            System.out.println("Key: " + key + ", Value: " + hMapNumbers.get(key));
        } 
        System.out.println("");*/
        System.out.println("hMapNumbers.entrySet()= "+hMapNumbers.entrySet());
       /* Iterator itr=hMapNumbers.keySet().iterator();
        System.out.println("itr= "+itr.toString());
        for(Map<Integer, String> map:hMapNumbers.entrySet())
        {
        	
        }*/
        
	}

}

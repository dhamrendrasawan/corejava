
package com.sawan;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

	 static void isDuplicate(String str )
	{
		 HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();	
		// Converting given string to char array		 
	        char[] strArray = str.toCharArray();
	     // checking each char of strArray
	        for (char c : strArray) {
	            if (charCountMap.containsKey(c)) {	 
	                // If char is present in charCountMap,
	                // incrementing it's count by 1
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            }
	            else {
	 
	                // If char is not present in charCountMap,
	                // putting this char to charCountMap with 1 as it's value
	               charCountMap.put(c, 1);
	            }
	        }
	        // Printing the charCountMap
	        for (Character c : charCountMap.keySet()) 
	        {
	        	 int value=charCountMap.get(c);
	        	 if(value>1)
	        	 {
	        		 System.out.print("duplicate char= "+c);
	        		
	        		 System.out.println("");
		                System.out.println(c + "" + value);
	        	 }        	 
	        	
	        }
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isDuplicate("JavaJ2EEE");
	}

}

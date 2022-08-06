package com.sawan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList2 {

	public static void main(String[] args) {

	    
		  List<String> al=new ArrayList<String>();//creating arraylist    
		  al.add("Sonoo");//adding object in arraylist    
		  al.add("Michael");    
		  al.add("James");    
		  al.add("Andy");   
		//  System.out.println(al.get(2));
		  //traversing elements using Iterator  
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());
	   }
	}
}

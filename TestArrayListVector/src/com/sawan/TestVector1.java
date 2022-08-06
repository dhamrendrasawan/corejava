package com.sawan;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class TestVector1 {

	public static void main(String[] args) {

		Vector<String> v=new Vector<String>();//creating vector
		  v.add("umesh");//method of Collection
		  v.addElement("irfan");//method of Vector
		  v.addElement("kumar");

		  Enumeration e=v.elements();
		  while(e.hasMoreElements()){
		       System.out.println(e.nextElement());
		  }
		  System.out.println("using iteraor");
		  //traversing elements using Iterator  
		  Iterator itr=v.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());
	   }
	}

}

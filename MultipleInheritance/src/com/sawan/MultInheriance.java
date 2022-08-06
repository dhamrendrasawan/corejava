package com.sawan;

interface Interface1 {

	 default void show()
	 {
		 System.out.println("default method in f1");
	 }
}
 interface Interface2 {
	
	default void show()
	 {
		 System.out.println("default method in f2");
	 }
}
public class MultInheriance implements Interface1,Interface2{	
	
	
   @Override
	public void show() {
		// TODO Auto-generated method stub
		Interface1.super.show();
		//Interface2.super.show();
		System.out.println("implemented show()");
	}
	
  /* @Override
   public void show() {
	   Interface1 inter1 = new MultInheriance();
       inter1.show();
       
       //Interface2 inter2 = new MultInheriance();
       //inter2.show();
       
       
   }*/
   
	public static void main(String[] args) {	       
		MultInheriance multobj=new MultInheriance();
		multobj.show();		
	}

	
	
}


package com.sawanjava81;

public interface InterF {
  
   public void m1();
   
   default void m2()
   {
	   System.out.println("Default method");
   }
   public static void m3()
   {
	   System.out.println("static method");
   }
	
}

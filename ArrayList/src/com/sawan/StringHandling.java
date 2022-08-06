package com.sawan;

public class StringHandling {

	public static void main(String[] args) {
		
		
		String str1=new String("ABC");
		String str="ABC";
		String str2=new String("ABC");
		String str3="ABC";

		  if(str==str2)
		  {
			  System.out.println("str==str2= "+str==str2  );		  
		  }
		  if(str1==str2)
		  {
			  System.out.println("str1==str2= "+str1==str2);
		  }
		  
		  if(str==str3)
		  {
			  System.out.println("str==str33= ");
		  }
      }
}

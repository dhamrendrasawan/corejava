package com.sawan;

public class NewInstanceExample {
	
	String str="hello"; 
	public static void main(String[] args) {
		 try  
         {              //creating object of class  
                NewInstanceExample obj= NewInstanceExample.class.newInstance();   
                System.out.println(obj.str);          
           }  
          catch(Exception e)  
          {  
              e.printStackTrace();  
           }  
	}

}

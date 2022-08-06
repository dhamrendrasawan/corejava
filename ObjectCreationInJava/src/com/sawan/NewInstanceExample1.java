package com.sawan;
import java.lang.reflect.Constructor;
public class NewInstanceExample1 {

	String str="hello";
	public static void main(String[] args) {        
	   try  
	   {  
		   Constructor<NewInstanceExample1> obj =NewInstanceExample1.class.getConstructor();  
		   NewInstanceExample1 obj1 = obj.newInstance();  
		   System.out.println(obj1.str);  
		}  
		catch(Exception e)  
		{  
		    e.printStackTrace();  
		}
	}
}

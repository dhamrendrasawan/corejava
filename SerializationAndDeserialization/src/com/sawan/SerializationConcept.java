package com.sawan;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable 
{
	private int id;  
	 private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}  
	 
	 
	 
}
public class SerializationConcept {

	public static void main(String[] args) 
	{
		Student stobj=new Student();
		stobj.setId(900);
		stobj.setName("Dk Sawan");
		
	  try
	  {
		FileOutputStream fout=new FileOutputStream("D:/Software/Details/f.txt"); 
		ObjectOutputStream ost=new ObjectOutputStream(fout);
		ost.writeObject(stobj);
		ost.flush();    
		  //closing the stream    
		ost.close();    
		  System.out.println("success");   
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	}

}

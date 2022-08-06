package com.sawan;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
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
public class Deserializable {

	public static void main(String[] args) {

		try
		{
		     FileInputStream fis=new FileInputStream("D:/Software/Details/f.txt");
		     ObjectInputStream ois=new ObjectInputStream(fis);
		     Student st= (Student)ois.readObject();
		    System.out.println( st.getId());
		    System.out.println( st.getName()); 
		   
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

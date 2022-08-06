package com.sawan;

public class ChildClass extends ParentClass1{
	
	@Override
	public int show()
	{
		System.out.println("Child");
		return 200;
	}
	
	public String display()
	{
		System.out.println("parent dislay");
		return "parent dislay";
	}
	
}

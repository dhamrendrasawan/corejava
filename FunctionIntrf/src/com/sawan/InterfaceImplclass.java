package com.sawan;

interface Inf1
{
	default void show()
	  {
		  System.out.println("Inf1 show()");
	  }
	  
}
interface Inf2
{
	  default void show()
	  {
		  System.out.println("Inf2 show()");
	  }
}


public class InterfaceImplclass implements Inf1,Inf2{

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImplclass obj=new InterfaceImplclass();
		obj.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Inf2.super.show();
	}

}

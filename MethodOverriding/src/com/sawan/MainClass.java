package com.sawan;

public class MainClass {

	
	public static void main(String[] args) {

		ChildClass obj=new ChildClass();
		int x=obj.show();
		System.out.println("x= "+x);
		
		ParentClass1 pobj=new ParentClass1();
		int y=pobj.show();
		System.out.println("parent=y "+y);
		//other way to call parent class method
		
		
		
		/*ChildClass objprnt=new ChildClass();
		int z=super.show();
		System.out.println("parent=z "+z);*/
		System.out.println("child referenc");
		ParentClass1 pobjchild=new ChildClass();
		int xyz=pobjchild.show();
		System.out.println("xyz  "+xyz);
		//other way to call parent class method
		
		

	}

}

 package com.sawan;

public class ThreadEx1 {

	public static void main(String[] args) {

		System.out.println("w.r.t st1--result");
		Thread st1=new Thread(); 
		st1.start();
		
		System.out.println("w.r.t st2--result");
		Thread st2=new Thread(); 
		st2.start();
	}

}

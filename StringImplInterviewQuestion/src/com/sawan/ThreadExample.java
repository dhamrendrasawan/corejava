package com.sawan;

class Emp extends Thread
{
	 public void run()
	 {
		 System.out.println("thread");
	 }
}
public class ThreadExample {

	
	
	public static void main(String[] args) 
	{
		Emp t =new Emp(); 
		t.start();
      
     }
}

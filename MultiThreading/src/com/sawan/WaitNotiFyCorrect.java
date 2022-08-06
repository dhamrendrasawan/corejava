package com.sawan;

class Task extends Thread
{	    
	   @Override
	   public void run() {
		   System.out.println("child1");
		    synchronized(this)
		    {
		    	for(int i=1;i<=10;i++)
		    	{
		    		System.out.println("output= "+i);
		    	}
		    	System.out.println("child thread sending noificaion ");
		    	//this.notify();
		    	
		    }
		}
	  }
public class WaitNotiFyCorrect {

	public static void main(String[] args) throws InterruptedException{

		   Task task=new Task();
		   task.start();
		   
		   synchronized(task)
		   {
			   System.out.println("Trying to call wait method");
			  // task.wait(1000);
			   task.wait();
			   System.out.println("Main thread got noified");
			//  System.out.println(task.t);
		   }
		
		
	}

}

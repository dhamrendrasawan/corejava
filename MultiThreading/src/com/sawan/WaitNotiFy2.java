package com.sawan;


class A2 extends Thread
{
	    int t=0;
	   @Override
	   public void run() {
		   System.out.println("child1");
		    synchronized(this)
		    {
		    	for(int i=0;i<=10;i++)
		    	{
		    		t=t+i;
		    	}
		    	System.out.println("child2");
		    	this.notify();
		    	
		    }
		}
	  }
public class WaitNotiFy2 {

	public static void main(String[] args) throws InterruptedException{

		   Thread a=new A2();
		   a.start();
		   A2 a2=new A2();
		   synchronized(a)
		   {
			   System.out.println("Main Thread");
			   a.wait();
			//   a2.
			   System.out.println("Main thread got noified");
			   System.out.println(a2.t);
		   }
		
		
	}

}

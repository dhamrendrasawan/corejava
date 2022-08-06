package com.sawan;


class A1 extends Thread
{
	    int t=0;
	   @Override
	   public void run() {
		    synchronized(this)
		    {
		    	for(int i=0;i<=10;i++)
		    	{
		    		t=t+i;
		    	}
		        this.notify();
		        System.out.println("child thread t ="+ t);
		    }
		}
	  }
public class WaitNotiFy {

	public static void main(String[] args) throws InterruptedException{

		   A1 a=new A1();
		   a.start();
		   synchronized(a)
		   {
			   System.out.println("Main Thread");
			   a.wait();
			   
			   System.out.println("Main thread got noified");
			   System.out.println(a.t);
		   }
		
		
	}

}

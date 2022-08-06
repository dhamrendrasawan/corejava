package com.sawan;

public class TestDeadlockExample2 {

	String s1="Dhamrendra";
	String s2="Sawan";
	
	Thread t1=new Thread()
			{
		            public void run()
		            {
		            	while(true)
		            	{
		            		synchronized(s1)
		            		{
		            			try
		            			{
		            				System.out.println(Thread.currentThread().getName()+"in thread1 locked "+s1);
		            				Thread.sleep(100);
		            			}catch(InterruptedException e)
		            			{
		            				e.printStackTrace();
		            			}
		            		}
		            		synchronized(s2)
		            		{
	            				System.out.println(Thread.currentThread().getName()+" in thread1 locked "+s2);

		            			System.out.println(s1+" thread1 "+s2 );
		            		}
		            	}
		            }
			};
	
			Thread t2=new Thread()
			{
		            public void run()
		            {
		            	while(true)
		            	{
		            		synchronized(s2)
		            		{
	            				System.out.println(Thread.currentThread().getName()+" in thread2 locked "+s2);
		            		    synchronized(s1)
		            		   {
		            		    	System.out.println(s1+" thread2 "+s2 );
		            		    }
		            	    }
		               }
			      }
			};

	
	public static void main(String[] args) {

		TestDeadlockExample2 obj=new TestDeadlockExample2();
		obj.t1.start();
		obj.t2.start();
	}

}

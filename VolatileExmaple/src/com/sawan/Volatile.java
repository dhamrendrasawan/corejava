package com.sawan;
class App extends Thread
{
	
	private volatile boolean runing=true;
	public void run()
	{
		System.out.println("calling run");
		while(runing)
		{
			System.out.println("running");
			try
			{
				Thread.sleep(50);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
public void shutdown()
{
	System.out.println("After calling shutdown");
	this.runing=false;
}
}
public class Volatile {

	public static void main(String[] args) throws InterruptedException {
      
	App app=new App();
	app.start();
	Thread.sleep(500);
	
	app.shutdown();		
	}
}

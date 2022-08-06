package com.multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		
	ExecutorService execservice=Executors.newFixedThreadPool(10);
	/*execservice.execute(()->
	              {
		           System.out.println("ExecutorService)");
	               });*/
	//or
	execservice.execute(new Runnable()
                    	{
                              @Override
                              public void run()
                              {
                            	  System.out.println("Executor service");
                              }
	                    });

	// ExecutorService executorService = Executors.newFixedThreadPool(10);  

	execservice.shutdown();
	}

}

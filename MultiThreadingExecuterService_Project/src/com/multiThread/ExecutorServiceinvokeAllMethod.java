package com.multiThread;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceinvokeAllMethod {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService eservice=Executors.newSingleThreadExecutor();
		Set<Callable<String>> callables=new HashSet<Callable<String>>();
		callables.add(new Callable<String>()
				{
			              @Override
			              public String call()
			              {
			            	  return "Tast1";  
			              }
				   }
				);
	    
	callables.add(new Callable<String>()
	{
        @Override
        public String call()
        {
      	  return "Tast2";  
        }
    }
   );
	
	callables.add(new Callable<String>()
	{
        @Override
        public String call()
        {
      	  return "Tast3";  
        }
    }
   );
	
	List<Future<String>> futures =eservice.invokeAll(callables);
	for(Future<String> future:futures)
	{
        System.out.println("future.get = " + future.get());  
	}
	eservice.shutdown();
   }
}

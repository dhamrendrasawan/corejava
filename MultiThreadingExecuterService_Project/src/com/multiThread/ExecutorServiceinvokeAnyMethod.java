package com.multiThread;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceinvokeAnyMethod {

	public static void main(String[] args) throws InterruptedException, ExecutionException{

		ExecutorService service=Executors.newSingleThreadExecutor();
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
	String result=service.invokeAny(callables);
    System.out.println("result = " + result);  
    service.shutdown();
}
}
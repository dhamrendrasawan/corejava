package com.multiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExampleOfCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException  {
		
		ExecutorService eservice=Executors.newSingleThreadExecutor();
		Future<?> future=eservice.submit(new Task());
		System.out.println("future= "+future.get());
	}	
}
class Task implements Callable
{

	@Override
	public String call() throws Exception {
		
		 System.out.println("In call");
		 String name = "test";
	     return name;
	}		
}

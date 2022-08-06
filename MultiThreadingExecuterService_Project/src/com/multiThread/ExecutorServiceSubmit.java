package com.multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceSubmit {

	public static void main(String[] args) {
       
	   ExecutorService service=Executors.newSingleThreadExecutor();
	   service.submit(new Runnable(){			   
			    @Override
			     public void run()
			     {
			        System.out.println("ExecutorService");
			     }
	            }
			   );       
	}
}

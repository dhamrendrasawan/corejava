package com.multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExampleAssigningTask {

	public static void main(String[] args) {
		
		ExecutorService service=Executors.newSingleThreadExecutor();
		service.execute(()->{
			System.out.println("ExecutorService");
			});
	}

}

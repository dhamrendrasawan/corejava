package com.sawanjava83;

public class MultiThreadingWithoutLambda {

	public static void main(String[] args) {
	       
                    MyRunnable r=new MyRunnable();
                     Thread t=new Thread(r);
                     t.start();
                     

	                  for(int i=0;i<10;i++)
	                  {
		                System.out.println("main thread");
	                   }
	
	   }

   }

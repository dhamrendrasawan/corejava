package com.sawan;

/*class A implements Runnable
{

	@Override
	public void run() {
System.out.println("Thread");		
	}
}*/
public class Threadlamd {

	public static void main(String[] args) {

		  Runnable r=new Thread();
		 // Thread t=new Thread(r);
		  r =()->
		  {
			  System.out.printf("Thread");
		  };
		  r.run();
	}

}

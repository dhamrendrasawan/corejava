package com.sawan;

public class ThreadEx7 {

	public static void main(String[] args) {

		Thread t=Thread.currentThread();
		System.out.println("Default	Threads="+t);//Thread[main,5,main]
		t.setName("Hyd");
		System.out.println("Default	Threads="+t);//Thread[Hyd,5,main]
		System.out.println("No. of threads="+Thread.activeCount());
	}

}

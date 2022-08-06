package com.sawan;

public class ThreadEx6 {

	public static void main(String[] args) {

		        System.out.println("Val of max	pri="+Thread.MAX_PRIORITY); //10
				System.out.println("Val of min	pri="+Thread.MIN_PRIORITY); //1
				System.out.println("Val of norm		pri="+Thread.NORM_PRIORITY);//5
				System.out.println(Thread.activeCount());
				System.out.println(Thread.class.getName());

	}

}

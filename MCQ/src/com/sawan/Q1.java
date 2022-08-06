package com.sawan;

public class Q1 {

	public static void main(String[] args) {

		try {
    		int val = 10/0;
    	} catch(Exception e) {
    		System.out.println(e);
    	} catch(ArithmeticException ae) {
    		System.out.println(ae);
    	}
	}

}

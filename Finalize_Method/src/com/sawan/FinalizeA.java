package com.sawan;

public class FinalizeA {

 public void finalize() throws Throwable
 {
          System.out.println("Object is destroyed by the Garbage Collector");
  }
  public static void main(String[] args) 
 {
		FinalizeA test = new FinalizeA();
		test = null;
		System.gc();
	}

}

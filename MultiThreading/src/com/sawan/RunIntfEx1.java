package com.sawan;

class Test implements Runnable
{
    public void run()
    {
     System.out.println("i am from run()--overridden");
     }
}//Test---BLC
public class RunIntfEx1 {

	public static void main(String[] args) {
		Runnable t1=new Test(); 
		//t1.start();------> error 
		Thread t11=new Thread(t1,"KVR"); 
		System.out.println("Name of FGT="+t11.getName());
		 t11.start(); 
	}

}

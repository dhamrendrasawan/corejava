package com.sawan;

import java.util.Scanner;
class RevNumGen implements Runnable
{
public void run()
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=Integer.parseInt(s.nextLine());
    if(n<=0)
     {
       System.out.println(n+" is Invalid input:");
    }
   else
   {
         System.out.println("---------------------------------------------------");
          System.out.println("Reverse Numbers within :"+n);
       System.out.println("----------------------------------------------------");
try
{
       for (int i=n; i>=1; i--)
         {
            System.out.println("Val ofi="+i);
            Thread.sleep(100);
           }
           System.out.println("----------------------------------------------------");
}catch(InterruptedException ie)
{
    System.out.println("Problem in thread execution:");
}
 }//else
}//run()
}//RevNumGen--BLC
public class RevNumGenDemoByRunnable {

	public static void main(String[] args) {

		// RevNumGen ro=new RevNumGen();
		Runnable ro=new RevNumGen();
		//ro.start(); invalid , start() does not exists in Runnable 
		Thread t=new Thread(ro);
		 t.start();
	}

}

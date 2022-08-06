package com.sawan;

class SumTh1 extends Thread
{
     public void run()
     {
        System.out.println("doing sum of operation:");
     }
  }//SumTh1----sub class of Thread class
class SubTh1 extends Thread
{
     public void run()
     {
         System.out.println("doing sub of operation:");
     }
}//SubTh1----sub class of Thread Class
public class ThreadEx2 {

	public static void main(String[] args) {

		System.out.println("w.r.t st1--result");
		SumTh1 st1=new SumTh1();
		st1.start();
		
		System.out.println("w.r.t st2--result");
		SubTh1 st2=new SubTh1();
		st2.start();
	}

}

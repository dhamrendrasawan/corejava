package com.sawan;

import java.util.Scanner;
class SumTh extends Thread
{
     public void run() // overridden run()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two Values:");
        int a=Integer.parseInt(s.nextLine());
        int b=Integer.parseInt(s.nextLine());
        int c=a+b;
         System.out.println("sum in run()="+c);
    }//run()
}//SumTh----BLC

public class ThreadEx4  {

	public static void main(String[] args) throws Exception
	{
		
		SumTh st=new SumTh(); //here st is called		ForeGroundTread
		System.out.println("Line-19->execution status ofst(FGT) before start()="+st.isAlive());// False
		st.start();		
		System.out.println("Line-->21execution status ofst(FGT) after start()="+st.isAlive());// True
		
		st.join(); // FGT will join with TGN after run()execution completion
		System.out.println("Line-23-Execution status of	st(FGT) after its completion="+st.isAlive()); // False
	}

}

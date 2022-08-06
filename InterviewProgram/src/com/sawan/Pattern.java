package com.sawan;

public class Pattern {

	public static void main(String[] args) {
		//2,33,444,5555,66666,777777,88888888
		String s="";

		int n=7;

		for(int i=1;i<=n;i++)
		{
		   for(int j=1;j<=i;j++)  
		   {
		        int temp=i+1;    
		       s=s+temp+"";
		    }
		   System.out.print(s+" ");
		    s="";
		}
	}

}

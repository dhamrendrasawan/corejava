package com.sawan;

public class pattern {

	public static void main(String[] args) {
    //A B C D
		//A B C
		//A B
		//A
		 char arr[]={'A', 'B', 'C', 'D'};
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0;j<arr.length-i;j++)
			 {
				 System.out.print(" "+arr[j]+" ");
				 
			 }
			 System.out.println();
			 //System.out.print(arr[0]); 
		 }
		  //System.out.print(arr[0]);

	}

}

package com.sawan;

import java.util.ArrayList;

public class Programinterview {

	public static void main(String[] args) {

		  //Input: 'W', 'e', 'L', 'c', 'o', 'M', 'e'
		//Output: 'e', 'c', 'o', 'e', 'W','L','M'
		//char c='a';
		//System.out.println(c);
		//A=65
		//a=92
		ArrayList<String> list=new ArrayList<String>();
		char arr[]={'W', 'e', 'L', 'c', 'o', 'M', 'e'};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>91)
			{
				list.add(arr[i]+"");
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<92)
			{
				list.add(arr[i]+"");
			}
			
		}
		System.out.println(list);
				
	}

}

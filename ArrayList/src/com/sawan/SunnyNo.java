package com.sawan;

import java.util.ArrayList;
import java.util.List;

public class SunnyNo {

	public static void main(String[] args) {
		
		int n=50;		
	
		List<Integer> list=new ArrayList<Integer>();
		for(int i=2;i<=n/2;i++)
		{
			int sq=i*i;
			if(sq<=50)
			{
				list.add(sq-1);
			}
			
			
		}
		System.out.println(list);

	}

}

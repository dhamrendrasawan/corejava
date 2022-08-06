package com.sawan;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Capgimini {

	public static void main(String[] args) {
		
		/*//int[] numbers = new int[]{1, 2, 3, 5};
		int[] numbers = new int[]{1, 2, 3, 5,8,4,9};
		List<Integer> sorted=Arrays.asList(numbers).stream().sorted().collect(Collectors.toList());
		int max=numbers[numbers.length-1];
		for(int i=1;i<=max-1;i++)
		{
			int num=numbers[i-1];
			if(!(i==num))
			{
				System.out.println("missing no= "+i);
			}
		}*/
		
		String s="capgeminic";
		String nrep1="";

		String arg[]=s.split("");
		int count=0;
		
		Map<String,Long> map=Arrays.asList(arg).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		for(String str:map.keySet())
		{   
			//final String nrep="";
			if(map.get(str)==1)
			{
			    count++;
			    if(count==2)
			    {
			    	nrep1=str;
			    }
			}	
		}
		System.out.println(nrep1);

	}

}

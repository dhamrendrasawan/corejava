package com.sawan;
import java.util.ArrayList;
import java.util.Arrays;
public class RepeatedChar {

	public static void main(String[] args) {

		//Input: AAAAABBCCAAG
		//output: 5A2B2C2A1G
		String s="HHHQMDOOOOHOO ";
		System.out.println("size= "+s.length());
		ArrayList<String> list=new ArrayList<String>();
		int count=1;
		for(int i=0;i<s.length()-1;i++)
        {
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
				
			}
			else
			{
				if(i==s.length()-1)
				{
					if(count<2)
					{
					String s1=count+""+s.charAt(i)+"";
					list.add(s1);
					}
				}
				
				String s1=count+""+s.charAt(i)+"";
				list.add(s1);
                 count=1;
			}
			
        }
		System.out.println(list);
		String data=list.toString();
		System.out.println("data="+data);
		
	}

}

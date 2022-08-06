package com.sawan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Pattern {

	public static void main(String[] args) {
        int count=0;
        int temp=0;
	   ArrayList<Integer> list=new ArrayList<>();
	   list.add(92);
	   list.add(96);
	   list.add(91);
	   list.add(99);

		for(int i=0;i<list.size();i++)
		{
		   int sec=  Collections.max(list);
		   list[i]=sec;
		}
	}


}

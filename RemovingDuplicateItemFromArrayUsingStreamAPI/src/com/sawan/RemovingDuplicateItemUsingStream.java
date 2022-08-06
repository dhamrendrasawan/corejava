package com.sawan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicateItemUsingStream {

	public static void main(String[] args) {
       
		Integer array[]={1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5};
		 // input list with duplicates
      //  List<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
		
	 List<Integer> listarray =Arrays.asList(array);

            // Print the Arraylist
        System.out.println("ArrayList with duplicates: " + listarray);  
        // Construct a new list from the set constucted from elements
        // of the original list
        List<Integer> distinctlist=listarray.stream().distinct().collect(Collectors.toList());
        System.out.println("distinctlist= "+distinctlist);
        //Sorted list
        distinctlist.stream().sorted().forEach(p->System.out.print(p+" "));
       // Integer c=90;
        //Byte p=0;
        //p=(Byte)c;
	}

}

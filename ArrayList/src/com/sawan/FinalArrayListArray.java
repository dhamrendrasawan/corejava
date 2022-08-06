package com.sawan;
import java.util.ArrayList;
import java.util.List;
public class FinalArrayListArray {

	public static void main(String[] args) {

		final List<Integer> list = new ArrayList<Integer>();
		//list = new ArrayList<Integer>();
		list.add(90);
	    list.add(78);
        list.add(967);
       // list.remove(10);

        System.out.println("list= "+list);        
        //it will not allowed
       // list = new ArrayList<Integer>(); // Since `list' is final, this won't compile
        
	}
}

package com.sawan;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("gosling");
        al.add("rossum");
        al.add("trump");
        al.add("modi");
        al.add("adams");
      //create a object of Stream class
        Stream<String> sn=al.stream();
      //apply the filter() of Stream class
        Stream<String> sn1=sn.filter(name->name.length()<=5);
      //display the values present in sn1
        System.out.println("------------------------------------------");
        System.out.println("Names of the people:");
        System.out.println("------------------------------------------");
        sn1.forEach(name->System.out.println(name));

		 
	}

}

package com.sawan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

class Studentdata
{
	
	private  String name;
	private Integer age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Studentdata(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}


public class AddNumber {

	public static void main(String[] args) {

		  List<Integer> list=Arrays.asList(5,2,3,1,4);	
		  
		  int sumoflistvalue=list.stream().mapToInt(p->p).sum();
			 System.out.println("sumoflist= "+sumoflistvalue);
			 
		 list.stream().mapToInt(p->p).sorted().forEach(System.out::print);		 
		 System.out.println();
		 
		 
		 
		 int arr[]={1,2,4,5,3};
		 Integer numlist=Arrays.stream(arr).sum();
		 System.out.println("sum= "+numlist);
		 
		 int  average=Arrays.stream(arr).max().getAsInt();
		 
		 System.out.println("average= "+average);	 
		 
		 
		 List<Studentdata> stlist=new ArrayList<Studentdata>() ;
		 Studentdata st1=new Studentdata("sawan4",4);
		 Studentdata st2=new Studentdata("sawan1",1);
		 Studentdata st3=new Studentdata("sawan2",2);
		 Studentdata st4=new Studentdata("sawan5",5);
		 stlist.add(st1);
		 stlist.add(st2);
		 stlist.add(st3);
		 stlist.add(st4);
		 Integer sum=stlist.stream().mapToInt(Studentdata::getAge).sum();
		 System.out.println("sum of age= "+ sum);
		 
	}
}
	
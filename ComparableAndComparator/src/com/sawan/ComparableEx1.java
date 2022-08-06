package com.sawan;

import java.util.ArrayList;
import java.util.*;
class Student3
{
	int sno;
	String name;
	float marks;
	Student3(int sno,String name,float marks)
	{
		this.sno=sno;
		this.name=name;
		this.marks=marks;
	}
	static void   dispStudInfo(ArrayList<Student3> al)
	{
		Iterator<Student3> itr=al.iterator();
		while(itr.hasNext())
		{
			Student3 s=itr.next();
			System.out.println(s.sno+"\t"+s.name+"\t"+s.marks);
		}
	}//dispStudInfo()'
}//
public class ComparableEx1 {

	public static void main(String[] args) {
		Student3 s1=new Student3(101,"Trump",34.44f);
		Student3 s2=new Student3(12,"Jobiden",44.44f);
		Student3 s3=new Student3(60,"Obama",74.44f);
		Student3 s4=new Student3(90,"Bush",64.74f);
		Student3 s5=new Student3(65,"Clinton",66.66f);
//add the objects data to CFW object
		ArrayList <Student3> al=new ArrayList<Student3>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		System.out.println("---------------------------------------------");
		System.out.println("Original Student Data");
		System.out.println("---------------------------------------------");
		System.out.println("Number\tName\tMarks");
		System.out.println("---------------------------------------------");
		Student3.dispStudInfo(al);
		System.out.println("---------------------------------------------");

	}

}

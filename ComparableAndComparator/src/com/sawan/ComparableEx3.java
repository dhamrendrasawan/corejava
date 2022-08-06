package com.sawan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
class Student1   implements Comparable<Student1>
{
	int sno;
	String name;
	float marks;
	Student1(int sno,String name,float marks)
	{
		this.sno=sno;
		this.name=name;
		this.marks=marks;
	}
	public   int    compareTo(Student1 so1)
	{
		//This functions receives two objects data first. First object data kept in current class object (this) and second object data placed into formal param.
		//Student1 so1=(Student1)obj;   
		return (this.sno-so1.sno);
	}//compareTo()
	static void   dispStudInfo(ArrayList<Student1> al)
	{
		Iterator<Student1> itr=al.iterator();
		while(itr.hasNext())
		{
			Student1 s=itr.next();
			System.out.println(s.sno+"\t"+s.name+"\t"+s.marks);
		}
	}//dispStudInfo()
}//Student---BLC
public class ComparableEx3 {

	public static void main(String[] args) {
		
			Student1 s1=new Student1(101,"Trump",34.44f);
			Student1 s2=new Student1(12,"Jobiden",44.44f);
			Student1 s3=new Student1(60,"Obama",74.44f);
			Student1 s4=new Student1(90,"Bush",64.74f);
			Student1 s5=new Student1(65,"Clinton",66.66f);
			Student1 s6=new Student1(6,"kvr",16.66f);
	//add the objects data to CFW object
			ArrayList <Student1> al=new ArrayList<Student1>();
			al.add(s1);
			al.add(s2);
			al.add(s3);
			al.add(s4);
			al.add(s5);
			al.add(s6);
			System.out.println("---------------------------------------------");
			System.out.println("Original Student Data");
			System.out.println("---------------------------------------------");
			System.out.println("Number\tName\tMarks");
			System.out.println("---------------------------------------------");
			Student1.dispStudInfo(al);
			System.out.println("---------------------------------------------");
			Collections.sort(al);//calls internall compareTo() of Student class--Student object data sorted based o student number
			System.out.println("Sorted Student Data Based Student Number--ASC Order");
			System.out.println("---------------------------------------------");
			System.out.println("Number\tName\tMarks");
			System.out.println("---------------------------------------------");
			Student1.dispStudInfo(al);
			System.out.println("---------------------------------------------");
	}

}

package com.sawan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
class Student   implements Comparable
{
	int sno;
	String name;
	float marks;
	Student(int sno,String name,float marks)
	{
		this.sno=sno;
		this.name=name;
		this.marks=marks;
	}
	public int compareTo(Object obj)
	{		//This functions receives two objects data first. First object data kept in current class object (this) and second object data placed into formal param.
		Student so1=(Student)obj;   
		if(this.sno==so1.sno)
			return 0;
		else
		{
			 if(this.sno>so1.sno)
				 return 1;
				else
				 return -1;
		}//else
	}//compareTo()
	static void   dispStudInfo(ArrayList<Student> al)
	{
		Iterator<Student> itr=al.iterator();
		while(itr.hasNext())
		{
			Student s=itr.next();
			System.out.println(s.sno+"\t"+s.name+"\t"+s.marks);
		}
	}//dispStudInfo()
}//Student---BLC
public class ComparableEx2 {

	public static void main(String[] args) {
		Student s1=new Student(101,"Trump",34.44f);
		Student s2=new Student(12,"Jobiden",44.44f);
		Student s3=new Student(60,"Obama",74.44f);
		Student s4=new Student(90,"Bush",64.74f);
		Student s5=new Student(65,"Clinton",66.66f);
//add the objects data to CFW object
		ArrayList <Student> al=new ArrayList<Student>();
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
		Student.dispStudInfo(al);
		System.out.println("---------------------------------------------");
		Collections.sort(al);//calls internall compareTo() of Student class--Student object data sorted based o student number
		System.out.println("Sorted Student Data Based Student Number--ASC Order");
		System.out.println("---------------------------------------------");
		System.out.println("Number\tName\tMarks");
		System.out.println("---------------------------------------------");
		Student.dispStudInfo(al);
		System.out.println("---------------------------------------------");
	}

}

package com.sawan;
import java.util.*;
class Employee
{
	int empno;
	String ename;
	float sal;
	Employee (int empno,String ename,float sal)
	{	this.empno=empno;
		this.ename=ename;
		this.sal=sal;
	}
}//Employee---BLC
class EmpDisplay
{
	static  void  dispInfo(List<Employee> l)
	{
		Iterator<Employee> itr=l.iterator();
		while(itr.hasNext())
		{
			Employee e=itr.next();
			System.out.println(e.empno+"\t\t"+e.ename+"\t\t"+e.sal);
		}//while
	}//dispInfo
}//EmpDisplay---BLC
class SortByEmpno1 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Employee eo1=(Employee)obj1;
		Employee eo2=(Employee)obj2;
		return (eo1.empno-eo2.empno); //ASC order
	}
}//SortByEmpno1--BLC
class SortByEmpno2 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Employee eo1=(Employee)obj1;
		Employee eo2=(Employee)obj2;
		return (eo2.empno-eo1.empno); //DESC order
	}
}//SortByEmpno2--BLC
class SortByNames1 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Employee eo1=(Employee)obj1;
		Employee eo2=(Employee)obj2;
		return (eo1.ename.compareTo(eo2.ename)); //ASC  order
	}
}//SortByNames1---BLC
class SortByNames2 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Employee eo1=(Employee)obj1;
		Employee eo2=(Employee)obj2;
		return (eo2.ename.compareTo(eo1.ename)); //DESC  order
	}
}//SortByNames2---BLC
class SortBySal1 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Employee eo1=(Employee)obj1;
		Employee eo2=(Employee)obj2;
		if(eo1.sal==eo2.sal)    //ASC order logic
			 return 0;
		else
		{
			  if(eo1.sal>eo2.sal)
				  return 1;
			  else
				  return -1;
		}//else
	}//compare()
}//SortBySal1---BLC 
class SortBySal2 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Employee eo1=(Employee)obj1;
		Employee eo2=(Employee)obj2;
		if(eo1.sal==eo2.sal)    //DESC order logic
			 return 0;
		else
		{
			  if(eo2.sal>eo1.sal)
				  return 1;
			  else
				  return -1;
		}//else
	}//compare()
}//SortBySal2---BLC 
public class ComparatorEx1 {

	public static void main(String[] args) {

		Employee eo1=new Employee(100,"ashish",2.3f);
		Employee eo2=new Employee(20,"mahesh",3.3f);
		Employee eo3=new Employee(60,"sipun",4.3f);
		Employee eo4=new Employee(40,"naveen",5.4f);
		Employee eo5=new Employee(50,"vishal",2.0f);
//add the employee objects to CFW object
		List<Employee> l=new ArrayList<Employee>();
		l.add(eo1);
		l.add(eo2);
		l.add(eo3);
		l.add(eo4);
		l.add(eo5);
		System.out.println("---------------------------------------------");
		System.out.println("Original Employee Data");
		System.out.println("---------------------------------------------");
		System.out.println("EmpNumber\tEmpName\t\tEmpSalary");
		System.out.println("---------------------------------------------");
		EmpDisplay.dispInfo(l);
		System.out.println("---------------------------------------------");
		//call Collections.sort()
		SortByEmpno1 s1=new SortByEmpno1();
		Collections.sort(l,s1);
		System.out.println("Employee Data--sorted By Empno----ASC Order");
		System.out.println("---------------------------------------------");
		System.out.println("EmpNumber\tEmpName\t\tEmpSalary");
		System.out.println("---------------------------------------------");
		EmpDisplay.dispInfo(l);
		System.out.println("---------------------------------------------");
		SortByEmpno2 s2=new SortByEmpno2();
		Collections.sort(l,s2);
		System.out.println("Employee Data--sorted By Empno----DESC Order");
		System.out.println("---------------------------------------------");
		System.out.println("EmpNumber\tEmpName\t\tEmpSalary");
		System.out.println("---------------------------------------------");
		EmpDisplay.dispInfo(l);
		System.out.println("---------------------------------------------");
		SortByNames1 s3=new SortByNames1();
		Collections.sort(l,s3);
		System.out.println("Employee Data--sorted By Emp Name----ASC Order");
		System.out.println("---------------------------------------------");
		System.out.println("EmpNumber\tEmpName\t\tEmpSalary");
		System.out.println("---------------------------------------------");
		EmpDisplay.dispInfo(l);
		System.out.println("---------------------------------------------");
		SortByNames2 s4=new SortByNames2();
		Collections.sort(l,s4);
		System.out.println("Employee Data--sorted By Emp Name----DESC Order");
		System.out.println("---------------------------------------------");
		System.out.println("EmpNumber\tEmpName\t\tEmpSalary");
		System.out.println("---------------------------------------------");
		EmpDisplay.dispInfo(l);
		System.out.println("---------------------------------------------");
		SortBySal1 s5=new SortBySal1();
		Collections.sort(l,s5);
		System.out.println("Employee Data--sorted By Emp Salary----ASC Order");
		System.out.println("---------------------------------------------");
		System.out.println("EmpNumber\tEmpName\t\tEmpSalary");
		System.out.println("---------------------------------------------");
		EmpDisplay.dispInfo(l);
		System.out.println("---------------------------------------------");
		SortBySal2 s6=new SortBySal2();
		Collections.sort(l,s6);
		System.out.println("Employee Data--sorted By Emp Salary----DESC Order");
		System.out.println("---------------------------------------------");
		System.out.println("EmpNumber\tEmpName\t\tEmpSalary");
		System.out.println("---------------------------------------------");
		EmpDisplay.dispInfo(l);
		System.out.println("---------------------------------------------");
	}

}

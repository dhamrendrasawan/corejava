package com.sawan;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
class Emp1
{
	int age;
	String name;
	int sal;
	  public Emp1(int age,String name,int sal)
	  {
		  this.age=age;
		  this.name=name;
		  this.sal=sal;
	  }
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sal
	 */
	public int getSal() {
		return sal;
	}
	/**
	 * @param sal the sal to set
	 */
	public void setSal(int sal) {
		this.sal = sal;
	}
	  
}
public class HCL {

	public static void main(String[] args) {

		List<Emp1> list=new ArrayList<Emp1>();
		list.add(new Emp1(50,"Rama",9000));
		list.add(new Emp1(60,"Ramayan",10000));
		list.add(new Emp1(70,"Raman",20000));
        list.stream().filter(p->p.sal>9000).forEach(l->System.out.println(l.name));
        
       List<String> strdata= list.stream().filter(p->p.sal>9000).map(p->p.name).collect(Collectors.toList());
       System.out.println("strdata="+strdata);
       
       List<Integer> agedata= list.stream().filter(p->p.sal>9000).map(p->p.age).collect(Collectors.toList());
       System.out.println("agedata="+agedata);
    
       Emp1 e1= list.stream().max(Comparator.comparingInt(Emp1::getSal)).get();
      System.out.println("max sal= "+e1.getSal());
      
      Emp1 e2=list.stream().min(Comparator.comparingInt(Emp1::getSal)).get();
      System.out.println("min sal= "+e2.getSal());
      
      int maxage=list.stream().max(Comparator.comparingInt(Emp1::getSal)).get().getAge();
      System.out.println("maxage="+maxage);
      
      int minage=list.stream().min(Comparator.comparingInt(Emp1::getSal)).get().getSal();
      System.out.println("minage="+minage);

 



	}

}

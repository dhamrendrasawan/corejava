package com.sawan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Customer {

	
	String name;
	int age;
	Customer(String name,int age)
	{
	this.name=name;
	this.age=age;
	}
	public static void main(String[] args) {
		
	Customer c1= new Customer("John",20);
	Customer c2= new Customer("Rohn",20);
	Customer c3= new Customer("Pohn",20);
	Customer c4= new Customer("Aohn",20);
	HashSet<Customer> customerSet=new HashSet<>();
	customerSet.add(c1);
	customerSet.add(c2);
	customerSet.add(c3);
	customerSet.add(c4);
	//System.out.println(customerSet.size());
	Iterator<Customer> itr=customerSet.iterator();
	List<Customer> list=new ArrayList<Customer>();
	
	 while(itr.hasNext())
	 {
		 list.add(itr.next());
	 }
     //List<User> sortedListAge = userList.stream().sorted(Comparator.comparingInt(User::getAge)).collect(Collectors.toList());

	 List<Customer> listsort=list.stream().sorted(Comparator.comparing(Customer::getName)).collect(Collectors.toList());
	System.out.println("listsort="+listsort);
	
	//sorting using set
	Set<Customer> setustomer=customerSet.stream().sorted(Comparator.comparing(Customer::getName)).collect(Collectors.toSet());
	System.out.println("setustomer= "+setustomer);
	
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	

}

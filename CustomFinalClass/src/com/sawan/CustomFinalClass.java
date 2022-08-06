package com.sawan;

import java.text.ParseException;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import com.sawan.util.MyUtil;

public class CustomFinalClass {

	public static void main(String[] args) throws ParseException{
	
		Address address=new Address();
		address.setStreet("kesariya");
		address.setZipCode(8779L);
		address.setAddressLine1("Address line 1");
		address.setAddressLine2("Address line 2");
		
		Set<String> skills=new LinkedHashSet<>();
		skills.add("Sring");
		skills.add("Hibernate");
		
		Date dob=MyUtil.stringToDate("04/01/1980");
		Employee employee=new Employee(9088,"Sean Murphy","sawan@gmail.com",dob,skills,address);
		
		System.out.println("ID: "+employee.getId());
		System.out.println("Name: "+employee.getName());
		System.out.println("Email: "+employee.getEmail());
		System.out.println("DOB: "+employee.getDob());
		System.out.println("skills: "+employee.getSkills());
		System.out.println("Employee Address:::::::");
		System.out.println("Street: "+address.getStreet());
		System.out.println("zipcode: "+address.getZipCode());
		System.out.println("addressline1 "+address.getAddressLine1());
		System.out.println("addressline2: "+address.getAddressLine2());
		//Let's try to change state of this employee object
		System.out.println("---------------------------------------");
		//try to modify Employee Address Street values
		employee.getAddress().setStreet("patna");
		employee.getDob().setTime(new Date().getTime());
		employee.getSkills().add("Spring boot");
		System.out.println("-----------------------------------/n");
		System.out.println("ID: "+employee.getId());
		System.out.println("Name: "+employee.getName());
		System.out.println("Email: "+employee.getEmail());
		System.out.println("DOB: "+employee.getDob());
		System.out.println("skills: "+employee.getSkills());
		System.out.println("Employee Address:::::::");
		System.out.println("Street: "+address.getStreet());
		System.out.println("zipcode: "+address.getZipCode());
		System.out.println("addressline1 "+address.getAddressLine1());
		System.out.println("addressline2: "+address.getAddressLine2());
	}

}

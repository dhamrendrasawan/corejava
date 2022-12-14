package com.sawan;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
public final class Employee {
	
	private final Integer id;
	private final String name;
	private final String email;
	private final Date dob;
	private final Set<String> skills;
	private final Address address;

	public Employee(Integer id,String name,String email,Date dob,Set<String> skills,Address address)
	{
		// super();
		this.id=id;
		this.name=name;
		this.email=email;
		this.dob=dob;
		this.skills=skills;
		this.address=address;
	}	
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}	
	public Date getDob() {
		return new Date(dob.getTime());
	}
	public Set<String> getSkills() {
		return new LinkedHashSet<>(skills);
	}	
	public Address getAddress() {
		Address empAddress=new Address();
		empAddress.setStreet(address.getStreet());
		empAddress.setZipCode(address.getZipCode());
		empAddress.setAddressLine1(address.getAddressLine1());
		empAddress.setAddressLine2(address.getAddressLine2());

		return empAddress;
		//return address;
	}
	
}

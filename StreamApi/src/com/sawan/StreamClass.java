package com.sawan;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
	String name;
	String adress;
	int age;
	public Student(String name, String address, int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.adress=address;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", adress=" + adress + ", age=" + age + "]";
	}
	
	
}
public class StreamClass {

	public static void main(String[] args) {

		List<Student> stdList=new ArrayList<Student>();
		Student student1=new Student("sawan","patna2",90);
		Student student2=new Student("sawan1","patna2",91);
		Student student3=new Student("sawan2","patna2",92);
		stdList.add(student1);
		stdList.add(student2);
		stdList.add(student3);
		
		stdList.stream().filter(st->st.adress.equalsIgnoreCase("patna2")).
		forEach(p->System.out.println(p.adress+" "+p.age+" "+p.name));
		
		long count=stdList.stream().filter(st->st.adress.equalsIgnoreCase("patna2")).count();
		System.out.println("count emp adrs patna= "+count);
		
		//age>20
		long countage=stdList.stream().filter(st->st.age>90).count();
		System.out.println("count emp adrs= "+countage);		
		//find element age>90 and name startwith 'd'
	 stdList.stream().filter(p->p.age>90 && p.age<95 ).filter(p1->p1.name.startsWith("s")).forEach(System.out::println);
				
		//System.out.println("stdListFilter= "+stdListFilter.g);
		
		
	}
	
}

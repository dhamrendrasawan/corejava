package com.sawan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class User
{
	   private String name;
	    private int age;
	    
		@Override
		public String toString() {
			return "User [name=" + name + ", age=" + age + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public User(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
	    
	    
	
}

public class SortingByCustomClass {

	public static void main(String[] args) {
		List<User> userList = new ArrayList<>(Arrays.asList(
		        new User("John", 33), 
		        new User("Robert", 26), 
		        new User("Aark", 26), 
		        new User("Brandon", 42)));		
	         

		  System.out.println("-------asc-sorting---by age---------------");
       List<User> sortedListAge = userList.stream().sorted(Comparator.comparingInt(User::getAge)).collect(Collectors.toList());
        sortedListAge.forEach(System.out::println);
        System.out.println("--------------------------");
        
        List<User> sortedListName = userList.stream()
                .sorted(Comparator.comparing(User::getName).reversed()).collect(Collectors.toList());  
             
              System.out.println("Method reference exp= ");
               sortedListName.forEach(System.out::println);
               
               System.out.println("using lamda exp= ");
               sortedListName.forEach(p->System.out.println(p));

        
        
	}

	@Override
	public String toString() {
		return "SortingByCustomClass [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
} 

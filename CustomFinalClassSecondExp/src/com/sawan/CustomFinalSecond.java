package com.sawan;

public class CustomFinalSecond {

	 static public  void main(String[] arg) throws CloneNotSupportedException {
		//student object creaation
		Student studentObj=new Student("Sawan",100);
		CustomImmutableClass immutableObj=new CustomImmutableClass("bankat",900,studentObj);
		//printing immutable object value
		System.out.println("Immutable object :\n"+immutableObj);
		//modifying mutable instance variable
		studentObj.setStudentName("PushpaSawan");
		
		//printing immutable object values after modification.
		System.out.println("Immuable object after modificaion\n"+immutableObj);
		
		/*//testing
		Student studentObj1=new Student("DK Sawan",100);
		CustomImmutableClass immutableObj1=new CustomImmutableClass("bankat1",9001,studentObj1);
		//printing immutable object value
		System.out.println("Immutable object :\n"+immutableObj1);
		//modifying mutable instance variable
		studentObj.setStudentName("PushpaSawan");
		
		//printing immutable object values after modification.
		System.out.println("Immuable object after modificaion\n"+immutableObj);
		if(immutableObj==immutableObj1)
		{
			System.out.println("shallow cloning");
		}
		else
		{
			System.out.println("Deep Cloning");
		}
		System.out.println("immutableObj.hashCode()="+immutableObj.hashCode()+" immutableObj1= "+immutableObj1.hashCode());
	*/
	}

}

package com.sawan;
import java.util.Scanner;

interface Figure
{
      void area();
}//Figure---Functional Interface
class Sawan 
{
     Scanner s=new Scanner(System.in);
     void circlearea() // Instance method
      {
    	   System.out.println("Enter Radious:");
           double r=Double.parseDouble(s.nextLine());
           double ac=3.14*r*r;
           System.out.println("Area of Circle--Mallesh="+ac);
     }
}//Mallesh---CC
class DK 
{
    Scanner s=new Scanner(System.in);
    void squarearea() // Instance method
    {
          System.out.println("Enter Side:");
         double side=Double.parseDouble(s.nextLine());
         double as=side * side;
          System.out.println("Area of Sqaure--Sipun="+as);
     }
}//Sipun--CC


public class InstanceMethodReferenceExp1 {

	public static void main(String[] args) {
		
		Figure frg=new Sawan()::circlearea;
		frg.area();
		
		Figure frg2=new DK()::squarearea;
		frg2.area();
	}

}

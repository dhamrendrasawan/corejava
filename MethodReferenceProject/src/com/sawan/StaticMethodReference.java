package com.sawan;
//MethodRefEx2.java
interface Shapes
{      void draw();
}//Shapes--interface
class Circle
{
      static void showshape() //static method reference
      {
            System.out.println("Drawing Circle--Circle");
      }
}//Circle---CC
class Rect
{
      static void show() //static method reference
       {
           System.out.println("Drawing Rect--Rect");
       }
}//Circle---CC



public class StaticMethodReference {

	public static void main(String[] args) {
		
		Shapes so=Circle::showshape; //static methodreference
		//so.showshape(); invalid, showshapes() does not exists in Shapes.
		so.draw();
		System.out.println("-----------------------------------------------");
		
		so=Rect::show;
		so.draw();

	}

}

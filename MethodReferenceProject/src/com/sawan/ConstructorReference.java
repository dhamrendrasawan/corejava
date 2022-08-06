package com.sawan;
interface Hello
{
	 void greet(String msg);
}
class Message
{
	  Message(String msg)
	  {
		  System.out.println("msg= "+msg);
	  }
}
public class ConstructorReference {

	public static void main(String[] args) {
     
		     Hello h= Message::new;
		     h.greet("Hi DK");
	}

}

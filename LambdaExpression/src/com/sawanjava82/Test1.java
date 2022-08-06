package com.sawanjava82;

public class Test1 {

	public static void main(String[] args) {
		InterF i =(a,b)->System.out.println("add="+(a+b));
		i.add(10, 30);
		i.add(100, 300);
	}

}

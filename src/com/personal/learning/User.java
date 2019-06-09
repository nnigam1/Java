package com.personal.learning;

public class User {
	public static void main( String args[]) {
		Test2 t = new Test2();
		Class c = t.getClass();
		while( c != null) {
			System.out.println(c.getName());
			c= c.getSuperclass();
		}
		
	}
};

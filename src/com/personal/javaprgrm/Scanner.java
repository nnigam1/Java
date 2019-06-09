// Code using Scanner Class 
package com.personal.javaprgrm;
import java.util.Scanner; 
class Differ 
{ 
	public static void main(String args[]) 
	{ 
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in); 
		System.out.println("Enter an integer"); 
		String a = scn.nextLine();  
		System.out.println("Enter a String"); 
		int b = scn.nextInt();
		System.out.printf("You have entered:- "
				+ a + " " + "and name as " + b); 
		
		StringBuilder sb = new StringBuilder("hello");
	} 
} 
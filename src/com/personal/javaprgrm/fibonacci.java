package com.personal.javaprgrm;

public class fibonacci {
	public static void main( String args[])
	{
		int a = 1 , b=1 , c=0;
		for(int i=0;i<5 ; i++)
		{
			System.out.println(a);
			c = a+b;
			a=b;
			b=c;
		}
	}
}

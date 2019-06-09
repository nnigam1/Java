package com.personal.javaprgrm;


// java treats each enum as object 
// By default enums have their own string values, we can also assign some custom values to enums
enum Color {
	RED, BLUE, GREEN;
}

public class Enum {
	public static void main(String[] args)
	{
		Color arr[] = Color.values();
		for(Color c: arr)
		{
			System.out.println( c.ordinal() + " the name is " + c);
		}
		
		System.out.println(Color.valueOf("WHITE"));
	}

}

package com.personal.javaprgrm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class palindrome {	
	public static void main( String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String b = "";
		int len = str.length();
		for( int i= len-1;i>=0 ; i--)
		{
			b = b + str.charAt(i);
		}
		if( str.equalsIgnoreCase(b))
		{
			System.out.println(" str is " + str + " b is " + b + " hence PALINDROME :)");
		}
		else
		{
			System.out.println(" str is " + str + " b is " + b + "hence Nope :( ");
		}
	}
}

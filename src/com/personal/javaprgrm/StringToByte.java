package com.personal.javaprgrm;

import java.util.Arrays;

public class StringToByte {
	
	public static void main(String args[])
	{
		String str = "Neha";
		byte[] byteArr = str.getBytes();
		System.out.println(Arrays.toString(byteArr));
		
	}

}

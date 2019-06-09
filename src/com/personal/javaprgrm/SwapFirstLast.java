package com.personal.javaprgrm;

public class SwapFirstLast {
	
	public static void main(String[] args) {
		String str = "     neha is intelligent     ";
		str = str.trim();
		char[] ch = str.toCharArray();
		for(int i=0;i<str.length() ; i++)
		{
			int k=i;
			while(i< ch.length && ch[i] != ' ')
				i++;
			
		char temp = ch[k];
		k=ch[i];
		ch[i] = temp;
		}
		
	}

}

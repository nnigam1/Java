package com.personal.javaprgrm;

public class StrToStrArr {
	
		
	public static void main(String[] args) {
		String str = "1-5, 8, 11-14, 18, 20, 26-29";
		expand(str);
	}


	private static void expand(String str) {
		String p = str;
		String arr[] = p.split("\\-");
		String k="";
		for(int i=0; i< arr.length ; i++)
		{
			if( i != arr.length -1)
			{
				String[] arr1 = arr[i].split(", ");
				String[] arr2 = arr[i+1].split(", ");
				int a = Integer.parseInt(arr1[arr1.length -1 ]);
				int b = Integer.parseInt(arr2[0]);
				for( int j = a+1;j < b ; j++)
				{
					arr[i] = arr[i] + ", " +j;
				}
			}
			if( k !="")
			{
				k = k+ ", " + arr[i];
			}
			else
			{
				k = k + arr[i];
			}
			
		}
			
		System.out.println(k);
		}

}

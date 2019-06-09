package com.personal.javaprgrm;

import java.util.Stack;

public class CollectionStack {
    public static void main( String[] args )
    {
        
         Stack<Integer> lt = new Stack<Integer>();
         lt.push(1);
         lt.push(2);
         lt.push(3);
         
         while(! lt.isEmpty())
         {
        	 	System.out.println("elements are : " + lt.pop());
         }
    }

}

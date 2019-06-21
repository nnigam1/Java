package com.personal.javaprgrm.stack;

import java.util.Stack;

public class QueueUsingStack {
	
	public static class Queue {
		
		 Stack<Integer> stack1 = new Stack<Integer>();
		 Stack<Integer> stack2 = new Stack<Integer>();
		
		void enQueue(int value)
		{
			while( !stack1.empty())
				stack2.push(stack1.pop());
			
			stack1.push(value);
			
			while( !stack2.empty())
				stack1.push(stack2.pop());
		}
		
		int deQueue()
		{
			return ((stack1.isEmpty() == true)  ? 0 : stack1.pop());
		}
		
	};

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		
		System.out.println("First element is : " + queue.deQueue());
		System.out.println("Second element is : " + queue.deQueue());
		System.out.println("Third element is : " + queue.deQueue());
		
	}
}



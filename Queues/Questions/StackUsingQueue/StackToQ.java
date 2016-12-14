package com.class3.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackToQ {

	Stack<Integer> stack;
	
	StackToQ()
	{
		stack = new Stack<Integer>();
	}
	
	public static void main(String[] args)
	{
		StackToQ s = new StackToQ();
		try
		{
			s.queuePush(1);
			s.queuePush(2);
			s.queuePush(3);
			s.queuePush(4);
			s.queuePush(5);
			System.out.println(s.stack.pop());
			System.out.println(s.stack.pop());
			System.out.println(s.stack.pop());
			System.out.println(s.stack.pop());
			System.out.println(s.stack.pop());
		}
		catch(EmptyStackException ese)
		{
			System.out.println("Stack is Empty");
		}
		
	}
	public void queuePush(int data)
	{
		if(!stack.isEmpty())
		{
			int temp = stack.pop();
			queuePush(data);
			stack.push(temp);
		}
		else
		{
			stack.push(data);
		}
	}
}

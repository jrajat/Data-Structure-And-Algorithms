package com.class4.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QToStack {

	Queue<Integer> q ;
	
	QToStack()
	{
		q = new LinkedList<Integer>();
	}
	
	public static void main(String[] args)
	{
		QToStack qts = new QToStack();		
		qts.stackEnqueue(1);
		qts.stackEnqueue(2);
		qts.stackEnqueue(3);
		qts.stackEnqueue(4);
		qts.stackEnqueue(5);
		System.out.println(qts.q.peek());
		qts.q.remove();
		System.out.println(qts.q.peek());
		qts.q.remove();
		System.out.println(qts.q.peek());
		qts.q.remove();
		System.out.println(qts.q.peek());
		qts.q.remove();
		System.out.println(qts.q.peek());
		qts.q.remove();
	}
	
	public void stackEnqueue(int data)
	{
		Queue<Integer> temp = new LinkedList<Integer>();
		temp.add(data);
		
		while(!q.isEmpty())
		{
			temp.add(q.peek());
			q.remove();
		}
		
		q = temp;
	}
}

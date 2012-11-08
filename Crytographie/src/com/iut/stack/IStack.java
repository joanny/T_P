package com.iut.stack;

import com.iut.stack.Stack.Element;
 

 
public interface IStack<T> {
	
	public int size();

	public  Element pop();

	public void peek();
 
	public boolean isEmpty();

	void push(T t);
}

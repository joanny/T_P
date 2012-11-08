package com.iut.LIFO;

import com.iut.LIFO.Lifo.Item;

public interface ILifo<T> {
	public int size();

	public Item pop();

	public void peek();

	public boolean isEmpty();

	public void push(T t);

}
